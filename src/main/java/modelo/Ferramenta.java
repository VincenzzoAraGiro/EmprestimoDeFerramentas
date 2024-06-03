package modelo;

import java.util.ArrayList;
import dao.FerramentaDAO;

public class Ferramenta extends Amigo{
    
    private int id;
    private String nome;
    private String marca;
    private int custo;
    
    // Construtor de Objeto Vazio
    public Ferramenta(){
        this(0,"","",0);
    }
    
    // Construtor com parâmetro
    public Ferramenta(int id, String nome, String marca, int custo){
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }
    
    // Métodos GET e SET
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getCusto(){
        return custo;
    }
    
    public void setCusto(int custo){
        this.custo = custo;
    }
    
    @Override
    public String toString(){
        return super.toString() + "nome=" + nome + ",marca=" + marca;
    }
    
    /* ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO SIMULANDO A ESTRUTURA EM 
    CAMADAS PARA USAR COM BANCOS DE DADOS. */
    // Retorna a lista de Alunos(objetos)
    public ArrayList<Ferramenta> getMinhaLista() {
        return FerramentaDAO.getMinhaLista();
    }
   
    // Cadastra novo aluno
    public boolean insertFerramentaBD(int id, String nome, String marca, int custo) {
        int id = this.maiorID() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        getMinhaLista().add(objeto);
    return true;
    }
    
    // Deleta um aluno específico pelo seu campo ID
    public boolean deleteAmigoBD(int id){
        int indice = this.procuraIndice(id);
        getMinhaLista().remove(indice);
        return true;
    }
    
    // Edita um aluno específico pelo seu campo ID
    public boolean updateAmigoBD(int id, String nome, String marca, int custo){
        Ferramenta objeto = new Ferramenta(id, nome, marca, custo);
        int indice = this.procuraIndice(id);
        getMinhaLista().set(indice, objeto);
        return true;
    }
    // Procura o INDICE de objeto da minhaLista que contem o ID enviado
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < getMinhaLista().size(); i++) {
        if (getMinhaLista().get(i).getId() == id) {
            indice = i;
        }
    }
return indice;
}
    // Carrega dados de um amigo especifico pelo seu ID
    public Ferramenta carregaAmigo(int id){
        int indice = this.procuraIndice(id);
        return getMinhaLista().get(indice);
    }
    // Retorna o maior ID da nossa base de dados
    public int maiorID(){
        return FerramentaDAO.maiorID();
    }
}