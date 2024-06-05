package modelo;

import dao.AmigoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class Amigo {
    // Atributos
    private int id;
    private String nome;
    private String telefone;

    // Construtor de Objeto Vazio
    public Amigo() {
        this(0, "", "");
    }

    // Construtor de Objeto, com parâmetros
    public Amigo(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    // Métodos GET e SET
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Amigo{id=" + id + ", nome=" + nome + ", telefone=" + telefone + '}';
    }

    // Métodos para uso junto com o DAO simulando a estrutura em camadas para usar com bancos de dados.
    public ArrayList<Amigo> getMinhaLista() throws SQLException {
        return AmigoDAO.getMinhaLista();
    }

    // Cadastra novo Amigo
    public boolean inserirAmigoDB(String nome, String telefone) throws SQLException {
        int id = this.maiorID() + 1;
        Amigo objeto = new Amigo(id, nome, telefone);
        AmigoDAO.adicionarAmigo(objeto);
        return true;
    }

    // Edita um Amigo específico pelo seu campo ID
    public boolean updateAmigoDB(int id, String nome, String telefone) throws SQLException {
        Amigo objeto = new Amigo(id, nome, telefone);
        AmigoDAO.atualizarAmigo(objeto);
        return true;
    }

    // Remove um Amigo específico pelo seu campo ID
    public boolean deleteAmigoDB(int id) throws SQLException {
        AmigoDAO.deletarAmigo(id);
        return true;
    }

    // Carrega dados de um Amigo específico pelo seu Id
    public Amigo carregaAmigo(int id) throws SQLException {
        return AmigoDAO.buscarAmigoPorId(id);
    }

    // Retorna o maior Id da nossa base de dados
    public int maiorID() throws SQLException {
        return AmigoDAO.maiorID();
    }
}