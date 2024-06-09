package modelo;

public class Ferramenta {
    private int id;
    private String nome;
    private String marca;
    private double custoAquisicao;

    // Construtor com argumentos
    public Ferramenta(int id, String nome, String marca, double custoAquisicao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custoAquisicao = custoAquisicao;
    }

    // Construtor padrão (sem argumentos)
    public Ferramenta() {
        this(0, "", "", 0.0);
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCustoAquisicao() {
        return custoAquisicao;
    }

    public void setCustoAquisicao(double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }

    @Override
    public String toString() {
        return "Ferramenta{id=" + id + ", nome=" + nome + ", marca=" + marca + ", custoAquisicao=" + custoAquisicao + '}';
    }

    public boolean insertFerramenta(String nome, String marca, double custoAquisicao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}