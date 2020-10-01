/**
* SQLiteJDBCDriverConnection.java
* Código das funcionalidades de um serviço de gerenciamento 
* de notas de alunos usando o método de serialização Protocol Buffer.
* Autores: Lucas Souza Santos & Alan Rodrigo Patriarca 
* Data de Criação: 26/08/2020
* Ultima atualização: 30/08/2020
 */

import java.sql.*;

//Fazer verificações campos vazios
//Adicionar Primary Key's tabela matricula
//Verificação caso ocorra erro ao buscar nota

public class Functionalities {

  public static String insertNota(Requisicao req, Resposta.Builder res, Connection dbConnection){
    int RA = req.getRA();
    String discCode = req.getDiscCode();
    int ano = req.getAno();
    int semestre = req.getSemestre();
    float nota = req.getNota();
    
    try {
      Statement statement = dbConnection.createStatement();

      //A princípio é necessário fazer 3 verificações, pois para atualizarmos a nota na tabela de mátricula, precisamos
      //que o Aluno e a disciplina Existam, pois uma mátricula é dependente dessas outras tabelas

      /* Busca pelo aluno */
      ResultSet resultSet = statement.executeQuery("SELECT * FROM aluno WHERE (ra = " + String.valueOf(RA) + ");");
      if(!resultSet.isBeforeFirst()){ 
        res.setMessage("RA inexistente");
        return "RA inexistente";
      }

      /* Busca pela disiplina */
      resultSet = statement.executeQuery("SELECT * FROM disciplina WHERE (codigo = '" + String.valueOf(discCode) + "');");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Disciplina inexistente");
        return "Disciplina inexistente";
      }

      /* Busca pela matricula */
      resultSet = statement.executeQuery("SELECT * FROM matricula WHERE (ra_aluno = " + String.valueOf(RA) + " AND cod_disciplina = '" + String.valueOf(discCode) + "' AND ano = "+ String.valueOf(ano) +" AND semestre = "+ String.valueOf(semestre) +");");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
        return ("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
      }

      /* Atualiza nota */
      statement.execute("INSERT INTO matricula(ra_aluno,ano,semestre,cod_disciplina,nota,faltas) VALUES(" + String.valueOf(RA) + "," + String.valueOf(ano) + "," + String.valueOf(semestre) + "," + String.valueOf(discCode) + "," + String.valueOf(nota) + "," + String.valueOf(0) + ");");
      res.setMessage("1");
      
    } catch (Exception e) {
      res.setMessage(String.valueOf(e.getMessage()));
      return String.valueOf(e.getMessage());
    }
    return "1";
  }

  public static String selectNota(Requisicao req, Resposta.Builder res, Connection dbConnection) { //Atualiza nota
    /* Obtendo os dados para a busca e insercao */
    int RA = req.getRA();
    String discCode = req.getDiscCode();
    int ano = req.getAno();
    int semestre = req.getSemestre();

    try {

      Statement statement = dbConnection.createStatement();

      //A princípio é necessário fazer 3 verificações, pois para atualizarmos a nota na tabela de mátricula, precisamos
      //que o Aluno e a disciplina Existam, pois uma mátricula é dependente dessas outras tabelas

      /* Busca pelo aluno */
      ResultSet resultSet = statement.executeQuery("SELECT * FROM aluno WHERE (ra = " + String.valueOf(RA) + ");");
      if(!resultSet.isBeforeFirst()){ //************** Verificar
        res.setMessage("RA inexistente");
        return "RA inexistente";
      }

      /* Busca pela disiplina */
      resultSet = statement.executeQuery("SELECT * FROM disciplina WHERE (codigo = '" + String.valueOf(discCode) + "');");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Disciplina inexistente");
        return "Disciplina inexistente";
      }

      /* Busca pela matricula */
      resultSet = statement.executeQuery("SELECT * FROM matricula WHERE (ra_aluno = " + String.valueOf(RA) + " AND cod_disciplina = '" + String.valueOf(discCode) + "' AND ano = "+ String.valueOf(ano) +" AND semestre = "+ String.valueOf(semestre) +");");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
        return ("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
      }

      /* Consulta nota */
      resultSet = statement.executeQuery("SELECT * FROM matricula WHERE(ra_aluno = " + String.valueOf(RA) + "AND cod_disciplina = " + String.valueOf(discCode) + " AND semestre = " + String.valueOf(semestre) + " AND ano = "+ String.valueOf(ano) +");");

       /* Construindo Aluno */
       Matricula.Builder matricula = Matricula.newBuilder();
        
       /* Adicionando valores no aluno */
       matricula.setRA(resultSet.getInt("ra"));
       matricula.setNota(resultSet.getFloat("nota"));
       matricula.setFaltas(resultSet.getInt("faltas"));
       matricula.setCodDisciplina(resultSet.getString("cod_disciplina"));
       matricula.setAno(resultSet.getInt("ano"));
       matricula.setSemestre(resultSet.getInt("semestre"));

       /* Adicionando aluno */
       res.addMatricula(matricula);
       res.setMessage("1"); 


    } catch (SQLException e) {
      res.setMessage(String.valueOf(e.getMessage()));
      return String.valueOf(e.getMessage());
    }
    return "1";
  }

  public static String updateNota(Requisicao req, Resposta.Builder res, Connection dbConnection) { //Atualiza nota
    /* Obtendo os dados para a busca e insercao */
    int RA = req.getRA();
    String discCode = req.getDiscCode();
    int ano = req.getAno();
    int semestre = req.getSemestre();
    float nota = req.getNota();

    try {

      Statement statement = dbConnection.createStatement();

      //A princípio é necessário fazer 3 verificações, pois para atualizarmos a nota na tabela de mátricula, precisamos
      //que o Aluno e a disciplina Existam, pois uma mátricula é dependente dessas outras tabelas

      /* Busca pelo aluno */
      ResultSet resultSet = statement.executeQuery("SELECT * FROM aluno WHERE (ra = " + String.valueOf(RA) + ");");
      if(!resultSet.isBeforeFirst()){ //************** Verificar
        res.setMessage("RA inexistente");
        return "RA inexistente";
      }

      /* Busca pela disiplina */
      resultSet = statement.executeQuery("SELECT * FROM disciplina WHERE (codigo = '" + String.valueOf(discCode) + "');");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Disciplina inexistente");
        return "Disciplina inexistente";
      }

      /* Busca pela matricula */
      resultSet = statement.executeQuery("SELECT * FROM matricula WHERE (ra_aluno = " + String.valueOf(RA) + " AND cod_disciplina = '" + String.valueOf(discCode) + "' AND ano = "+ String.valueOf(ano) +" AND semestre = "+ String.valueOf(semestre) +");");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
        return ("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
      }

      /* Atualiza nota */
      statement.execute("UPDATE matricula SET nota = " + String.valueOf(nota) + " WHERE (ra_aluno = " + String.valueOf(RA) + " AND cod_disciplina = '" + String.valueOf(discCode) + "' AND ano = "+ String.valueOf(ano) +" AND semestre = "+ String.valueOf(semestre) +");");
      res.setMessage("1");

    } catch (SQLException e) {
      res.setMessage(String.valueOf(e.getMessage()));
      return String.valueOf(e.getMessage());
    }
    return "1";
  }

  public static String rmNota(Requisicao req, Resposta.Builder res, Connection dbConnection) {
    /* Obtendo os dados para a busca e insercao */
    int RA = req.getRA();
    String discCode = req.getDiscCode();
    int ano = req.getAno();
    int semestre = req.getSemestre();

    try {

      Statement statement = dbConnection.createStatement();

      /* Busca pelo aluno */
      ResultSet resultSet = statement.executeQuery("SELECT * FROM aluno WHERE (ra = " + String.valueOf(RA) + ");");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("RA inexistente");
        return "RA inexistente";
      }

      /* Busca pela disiplina */
      resultSet = statement.executeQuery("SELECT * FROM disciplina WHERE (codigo = '" + String.valueOf(discCode) + "');");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Disciplina inexistente");
        return "Disciplina inexistente";
      }

      /* Busca pela matricula */
      resultSet = statement.executeQuery("SELECT * FROM matricula WHERE (ra_aluno = " + String.valueOf(RA) + " AND cod_disciplina = '" + String.valueOf(discCode) + "' AND ano = "+ String.valueOf(ano) +" AND semestre = "+ String.valueOf(semestre) +");");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
        return ("Matricula do aluno em " + String.valueOf(ano) + "/" + String.valueOf(semestre) + " inexistente");
      }

      /* remove nota */
      statement.execute("UPDATE matricula SET nota = '' WHERE (ra_aluno = " + String.valueOf(RA) + " AND cod_disciplina = '" + String.valueOf(discCode) + "' AND ano = "+ String.valueOf(ano) +" AND semestre = "+ String.valueOf(semestre) +");");
      res.setMessage("1");

    } catch (SQLException e) {
      res.setMessage(String.valueOf(e.getMessage()));
      return String.valueOf(e.getMessage());
    }
    return "1";
  }

  public static String selectNotasFaltas(Requisicao req, Resposta.Builder res, Connection dbConnection) {
    /* Obtendo os dados para a busca */
    String discCode = req.getDiscCode();
    int ano = req.getAno();
    int semestre = req.getSemestre();

    try {

      Statement statement = dbConnection.createStatement();

      /* Busca pela disiplina */
      ResultSet resultSet = statement.executeQuery("SELECT * FROM disciplina WHERE (codigo = '" + String.valueOf(discCode) + "');");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Disciplina inexistente");
        return "Disciplina inexistente";
      }

      /* Lista notas e faltas de uma determinada disciplina em um ano e semestre */
      resultSet = statement.executeQuery("SELECT * FROM disciplina, matricula WHERE (SELECT nota, faltas, ra FROM matricula WHERE ano = " + String.valueOf(ano) + " AND semestre = " + String.valueOf(semestre) + " AND cod_disciplina = '" + String.valueOf(discCode) + "') AND disciplina.codigo = matricula.cod_disciplina;");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Nesta disciplina nao ha alunos matriculados em " + String.valueOf(ano) + "/" + String.valueOf(semestre));
        return ("Nesta disciplina nao ha alunos matriculados em " + String.valueOf(ano) + "/" + String.valueOf(semestre));
      }

      while (resultSet.next()) {

        /* Construindo Matricula */
        Matricula.Builder matricula = Matricula.newBuilder();
        
        /* Adicionando valores a matricula */
        matricula.setRA(resultSet.getInt("ra"));
        matricula.setNota(resultSet.getFloat("nota"));
        matricula.setFaltas(resultSet.getInt("faltas"));
        matricula.setCodDisciplina(discCode);
        matricula.setAno(ano);
        matricula.setSemestre(semestre);

        /* Adicionando matricula */
        res.addMatricula(matricula);
      }
  
      res.setMessage("1");

    } catch (SQLException e) {
      res.setMessage(String.valueOf(e.getMessage()));
      return String.valueOf(e.getMessage());
    }
    return "1";
  }

  public static String listAlunos(Requisicao req, Resposta.Builder res, Connection dbConnection) {
    /* Obtendo os dados para a busca */
    String discCode = req.getDiscCode();
    int ano = req.getAno();
    int semestre = req.getSemestre();

    try {

      Statement statement = dbConnection.createStatement();

      /* Busca pela disiplina */
      ResultSet resultSet = statement.executeQuery("SELECT * FROM disciplina WHERE (codigo = '" + String.valueOf(discCode) + "');");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Disciplina inexistente");
        return "Disciplina inexistente";
      }
      
      /* Lista alunos */
      resultSet = statement.executeQuery("SELECT * FROM aluno, matricula WHERE (select ra_aluno FROM matricula WHERE ano = " + String.valueOf(ano) + " AND semestre = " + String.valueOf(semestre) + " AND cod_disciplina = '" + String.valueOf(discCode) + "') AND matricula.ra_aluno = aluno.ra;");
      if(!resultSet.isBeforeFirst()){
        res.setMessage("Nesta disciplina nao ha alunos matriculados em " + String.valueOf(ano) + "/" + String.valueOf(semestre));
        return ("Nesta disciplina nao ha alunos matriculados em " + String.valueOf(ano) + "/" + String.valueOf(semestre));
      }

      while (resultSet.next()) {

        /* Construindo Aluno */
        Aluno.Builder aluno = Aluno.newBuilder();
        
        /* Adicionando valores no aluno */
        aluno.setRA(resultSet.getInt("ra"));
        aluno.setNome(resultSet.getString("nome"));
        aluno.setPeriodo(resultSet.getInt("periodo"));
        aluno.setNota(resultSet.getFloat("nota"));
        aluno.setFaltas(resultSet.getInt("faltas"));

        /* Adicionando aluno */
        res.addAlunos(aluno);
      }
  
      res.setMessage("1");

    } catch (SQLException e) {
      res.setMessage(String.valueOf(e.getMessage()));
      return String.valueOf(e.getMessage());
    }
    return "1";
  }

}