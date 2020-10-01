// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

/**
 * Protobuf type {@code Aluno}
 */
public  final class Aluno extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Aluno)
    AlunoOrBuilder {
  // Use Aluno.newBuilder() to construct.
  private Aluno(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Aluno() {
    rA_ = 0;
    nome_ = "";
    periodo_ = 0;
    nota_ = 0F;
    faltas_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Aluno(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            rA_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nome_ = s;
            break;
          }
          case 24: {

            periodo_ = input.readInt32();
            break;
          }
          case 37: {

            nota_ = input.readFloat();
            break;
          }
          case 40: {

            faltas_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Grpc.internal_static_Aluno_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Grpc.internal_static_Aluno_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Aluno.class, Aluno.Builder.class);
  }

  public static final int RA_FIELD_NUMBER = 1;
  private int rA_;
  /**
   * <code>int32 RA = 1;</code>
   */
  public int getRA() {
    return rA_;
  }

  public static final int NOME_FIELD_NUMBER = 2;
  private volatile java.lang.Object nome_;
  /**
   * <code>string nome = 2;</code>
   */
  public java.lang.String getNome() {
    java.lang.Object ref = nome_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nome_ = s;
      return s;
    }
  }
  /**
   * <code>string nome = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNomeBytes() {
    java.lang.Object ref = nome_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nome_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERIODO_FIELD_NUMBER = 3;
  private int periodo_;
  /**
   * <code>int32 periodo = 3;</code>
   */
  public int getPeriodo() {
    return periodo_;
  }

  public static final int NOTA_FIELD_NUMBER = 4;
  private float nota_;
  /**
   * <code>float nota = 4;</code>
   */
  public float getNota() {
    return nota_;
  }

  public static final int FALTAS_FIELD_NUMBER = 5;
  private int faltas_;
  /**
   * <code>int32 faltas = 5;</code>
   */
  public int getFaltas() {
    return faltas_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (rA_ != 0) {
      output.writeInt32(1, rA_);
    }
    if (!getNomeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nome_);
    }
    if (periodo_ != 0) {
      output.writeInt32(3, periodo_);
    }
    if (nota_ != 0F) {
      output.writeFloat(4, nota_);
    }
    if (faltas_ != 0) {
      output.writeInt32(5, faltas_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rA_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, rA_);
    }
    if (!getNomeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nome_);
    }
    if (periodo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, periodo_);
    }
    if (nota_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, nota_);
    }
    if (faltas_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, faltas_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof Aluno)) {
      return super.equals(obj);
    }
    Aluno other = (Aluno) obj;

    boolean result = true;
    result = result && (getRA()
        == other.getRA());
    result = result && getNome()
        .equals(other.getNome());
    result = result && (getPeriodo()
        == other.getPeriodo());
    result = result && (
        java.lang.Float.floatToIntBits(getNota())
        == java.lang.Float.floatToIntBits(
            other.getNota()));
    result = result && (getFaltas()
        == other.getFaltas());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RA_FIELD_NUMBER;
    hash = (53 * hash) + getRA();
    hash = (37 * hash) + NOME_FIELD_NUMBER;
    hash = (53 * hash) + getNome().hashCode();
    hash = (37 * hash) + PERIODO_FIELD_NUMBER;
    hash = (53 * hash) + getPeriodo();
    hash = (37 * hash) + NOTA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNota());
    hash = (37 * hash) + FALTAS_FIELD_NUMBER;
    hash = (53 * hash) + getFaltas();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Aluno parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Aluno parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Aluno parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Aluno parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Aluno parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Aluno parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Aluno parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Aluno parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Aluno parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Aluno parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Aluno parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Aluno parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(Aluno prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Aluno}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Aluno)
      AlunoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Grpc.internal_static_Aluno_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Grpc.internal_static_Aluno_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Aluno.class, Aluno.Builder.class);
    }

    // Construct using Aluno.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      rA_ = 0;

      nome_ = "";

      periodo_ = 0;

      nota_ = 0F;

      faltas_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Grpc.internal_static_Aluno_descriptor;
    }

    public Aluno getDefaultInstanceForType() {
      return Aluno.getDefaultInstance();
    }

    public Aluno build() {
      Aluno result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Aluno buildPartial() {
      Aluno result = new Aluno(this);
      result.rA_ = rA_;
      result.nome_ = nome_;
      result.periodo_ = periodo_;
      result.nota_ = nota_;
      result.faltas_ = faltas_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Aluno) {
        return mergeFrom((Aluno)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Aluno other) {
      if (other == Aluno.getDefaultInstance()) return this;
      if (other.getRA() != 0) {
        setRA(other.getRA());
      }
      if (!other.getNome().isEmpty()) {
        nome_ = other.nome_;
        onChanged();
      }
      if (other.getPeriodo() != 0) {
        setPeriodo(other.getPeriodo());
      }
      if (other.getNota() != 0F) {
        setNota(other.getNota());
      }
      if (other.getFaltas() != 0) {
        setFaltas(other.getFaltas());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Aluno parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Aluno) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int rA_ ;
    /**
     * <code>int32 RA = 1;</code>
     */
    public int getRA() {
      return rA_;
    }
    /**
     * <code>int32 RA = 1;</code>
     */
    public Builder setRA(int value) {
      
      rA_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 RA = 1;</code>
     */
    public Builder clearRA() {
      
      rA_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nome_ = "";
    /**
     * <code>string nome = 2;</code>
     */
    public java.lang.String getNome() {
      java.lang.Object ref = nome_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nome_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nome = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNomeBytes() {
      java.lang.Object ref = nome_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nome_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nome = 2;</code>
     */
    public Builder setNome(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nome_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nome = 2;</code>
     */
    public Builder clearNome() {
      
      nome_ = getDefaultInstance().getNome();
      onChanged();
      return this;
    }
    /**
     * <code>string nome = 2;</code>
     */
    public Builder setNomeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nome_ = value;
      onChanged();
      return this;
    }

    private int periodo_ ;
    /**
     * <code>int32 periodo = 3;</code>
     */
    public int getPeriodo() {
      return periodo_;
    }
    /**
     * <code>int32 periodo = 3;</code>
     */
    public Builder setPeriodo(int value) {
      
      periodo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 periodo = 3;</code>
     */
    public Builder clearPeriodo() {
      
      periodo_ = 0;
      onChanged();
      return this;
    }

    private float nota_ ;
    /**
     * <code>float nota = 4;</code>
     */
    public float getNota() {
      return nota_;
    }
    /**
     * <code>float nota = 4;</code>
     */
    public Builder setNota(float value) {
      
      nota_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float nota = 4;</code>
     */
    public Builder clearNota() {
      
      nota_ = 0F;
      onChanged();
      return this;
    }

    private int faltas_ ;
    /**
     * <code>int32 faltas = 5;</code>
     */
    public int getFaltas() {
      return faltas_;
    }
    /**
     * <code>int32 faltas = 5;</code>
     */
    public Builder setFaltas(int value) {
      
      faltas_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 faltas = 5;</code>
     */
    public Builder clearFaltas() {
      
      faltas_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Aluno)
  }

  // @@protoc_insertion_point(class_scope:Aluno)
  private static final Aluno DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Aluno();
  }

  public static Aluno getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Aluno>
      PARSER = new com.google.protobuf.AbstractParser<Aluno>() {
    public Aluno parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Aluno(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Aluno> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Aluno> getParserForType() {
    return PARSER;
  }

  public Aluno getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
