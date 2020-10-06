from __future__ import print_function

import grpc
import configuracoesGrpc_pb2
import configuracoesGrpc_pb2_grpc

# Formatar print do selectNota

def client():
  #configura o canal de comunicacao
  channel = grpc.insecure_channel('localhost:7777')
  
  #inicializa e configura o stub
  stub = configuracoesGrpc_pb2_grpc.GerenciadorDeNotasStub(channel)
  
  print("[insertNota] Matricula o aluno em uma disciplina e adiciona a sua nota\n")
  print("[selectNota] Faz a consulta da nota de um aluno\n")
  print("[rmNota] Remove a nota de um aluno\n")
  print("[updateNota] Atualiza a nota de um aluno\n")
  print("[selectNotasFaltas] Lista as notas e faltas de uma disciplina em um ano/semestre\n")
  print("[listAlunos] Lista os alunos de uma disciplina em um ano/semestre\n")

  while(True):
    opCode = input("Que operação deseja fazer? > ")

    if (opCode == "insertNota"):
      RA = input("RA do aluno > ")
      discCode = input("Código da Disciplina > ")
      ano = input("Ano > ")
      semestre = input("Semestre > ")
      nota = input("Nota > ")

      #chamada remota
      response = stub.Mensagem(configuracoesGrpc_pb2.Requisicao(opCode=opCode, discCode=discCode, RA=int(RA), nota=float(nota), ano=int(ano), semestre=int(semestre)))

    elif (opCode == "selectNota"):
      RA = input("RA do aluno > ")
      discCode = input("Código da Disciplina > ")
      ano = input("Ano > ")
      semestre = input("Semestre > ")

      #chamada remota
      response = stub.Mensagem(configuracoesGrpc_pb2.Requisicao(opCode=opCode, discCode=discCode, RA=int(RA), ano=int(ano), semestre=int(semestre)))

    elif (opCode == "rmNota"):
      RA = input("RA do aluno > ")
      discCode = input("Código da Disciplina > ")
      ano = input("Ano > ")
      semestre = input("Semestre > ")

      #chamada remota
      response = stub.Mensagem(configuracoesGrpc_pb2.Requisicao(opCode=opCode, discCode=discCode, RA=int(RA), ano=int(ano), semestre=int(semestre)))
      print("Recebido: " + response.message)
    
    elif (opCode == "updateNota"):
      RA = input("RA do aluno > ")
      discCode = input("Código da Disciplina > ")
      ano = input("Ano > ")
      semestre = input("Semestre > ")
      nota = input("Nota > ")

      #chamada remota
      response = stub.Mensagem(configuracoesGrpc_pb2.Requisicao(opCode=opCode, discCode=discCode, RA=int(RA), ano=int(ano), semestre=int(semestre), nota=float(nota)))

    elif (opCode == "selectNotasFaltas"):
      discCode = input("Código da Disciplina > ")
      ano = input("Ano > ")
      semestre = input("Semestre > ")

      #chamada remota
      response = stub.Mensagem(configuracoesGrpc_pb2.Requisicao(opCode=opCode, discCode=discCode, ano=int(ano), semestre=int(semestre)))

    elif (opCode == "listAlunos"):
      discCode = input("Codigo da disciplina > ")
      ano = input("Ano > ")
      semestre = input("semestre > ")

      response = stub.Mensagem(configuracoesGrpc_pb2.Requisicao(opCode=opCode, discCode=discCode, ano=int(ano), semestre=int(semestre)))

    elif (opCode == "exit"):
      break
    
    else:
      continue
    
    print("\nRecebido: " + response.message)

    if(opCode == "selectNota" or opCode == "selectNotasFaltas"):
      for x in response.matricula:
        print(x)
    
    if(opCode == "listAlunos"):
      for x in response.alunos:
        print(x)


if __name__ == '__main__':
  client()
