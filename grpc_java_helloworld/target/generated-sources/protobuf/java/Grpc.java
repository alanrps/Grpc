// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

public final class Grpc {
  private Grpc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Requisicao_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Requisicao_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Aluno_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Aluno_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Matricula_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Matricula_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Resposta_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Resposta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ngrpc.proto\"\213\001\n\nRequisicao\022\016\n\006opCode\030\001 " +
      "\001(\t\022\017\n\007periodo\030\002 \001(\005\022\021\n\tcod_curso\030\003 \001(\005\022" +
      "\n\n\002RA\030\004 \001(\005\022\014\n\004nota\030\005 \001(\002\022\020\n\010discCode\030\006 " +
      "\001(\t\022\013\n\003ano\030\007 \001(\005\022\020\n\010semestre\030\010 \001(\005\"P\n\005Al" +
      "uno\022\n\n\002RA\030\001 \001(\005\022\014\n\004nome\030\002 \001(\t\022\017\n\007periodo" +
      "\030\003 \001(\005\022\014\n\004nota\030\004 \001(\002\022\016\n\006faltas\030\005 \001(\005\"l\n\t" +
      "Matricula\022\n\n\002RA\030\001 \001(\005\022\026\n\016cod_disciplina\030" +
      "\002 \001(\t\022\013\n\003ano\030\003 \001(\005\022\020\n\010semestre\030\004 \001(\005\022\014\n\004" +
      "nota\030\005 \001(\002\022\016\n\006faltas\030\006 \001(\005\"R\n\010Resposta\022\017" +
      "\n\007message\030\001 \001(\t\022\035\n\tmatricula\030\002 \003(\0132\n.Mat",
      "ricula\022\026\n\006alunos\030\003 \003(\0132\006.Aluno2:\n\022Gerenc" +
      "iadorDeNotas\022$\n\010Mensagem\022\013.Requisicao\032\t." +
      "Resposta\"\000B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Requisicao_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Requisicao_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Requisicao_descriptor,
        new java.lang.String[] { "OpCode", "Periodo", "CodCurso", "RA", "Nota", "DiscCode", "Ano", "Semestre", });
    internal_static_Aluno_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Aluno_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Aluno_descriptor,
        new java.lang.String[] { "RA", "Nome", "Periodo", "Nota", "Faltas", });
    internal_static_Matricula_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Matricula_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Matricula_descriptor,
        new java.lang.String[] { "RA", "CodDisciplina", "Ano", "Semestre", "Nota", "Faltas", });
    internal_static_Resposta_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Resposta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Resposta_descriptor,
        new java.lang.String[] { "Message", "Matricula", "Alunos", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
