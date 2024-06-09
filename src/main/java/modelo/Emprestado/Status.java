package modelo.Emprestado;

public enum Status {
    ABERTO(1),
    FECHADO(2),
    EM_ATRASO(3);

    private final int codigo;

    Status(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Status fromCodigo(int codigo) {
        for (Status status : Status.values()) {
            if (status.getCodigo() == codigo) {
                return status;
            }
        }
        throw new IllegalArgumentException("Código de status inválido: " + codigo);
    }
}
