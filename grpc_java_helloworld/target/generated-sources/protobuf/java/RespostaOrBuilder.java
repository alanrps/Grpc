// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

public interface RespostaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Resposta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .Matricula matricula = 2;</code>
   */
  java.util.List<Matricula> 
      getMatriculaList();
  /**
   * <code>repeated .Matricula matricula = 2;</code>
   */
  Matricula getMatricula(int index);
  /**
   * <code>repeated .Matricula matricula = 2;</code>
   */
  int getMatriculaCount();
  /**
   * <code>repeated .Matricula matricula = 2;</code>
   */
  java.util.List<? extends MatriculaOrBuilder> 
      getMatriculaOrBuilderList();
  /**
   * <code>repeated .Matricula matricula = 2;</code>
   */
  MatriculaOrBuilder getMatriculaOrBuilder(
      int index);

  /**
   * <code>repeated .Aluno alunos = 3;</code>
   */
  java.util.List<Aluno> 
      getAlunosList();
  /**
   * <code>repeated .Aluno alunos = 3;</code>
   */
  Aluno getAlunos(int index);
  /**
   * <code>repeated .Aluno alunos = 3;</code>
   */
  int getAlunosCount();
  /**
   * <code>repeated .Aluno alunos = 3;</code>
   */
  java.util.List<? extends AlunoOrBuilder> 
      getAlunosOrBuilderList();
  /**
   * <code>repeated .Aluno alunos = 3;</code>
   */
  AlunoOrBuilder getAlunosOrBuilder(
      int index);
}