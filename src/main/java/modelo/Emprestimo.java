package modelo;

import dao.EmprestimoDAO;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import modelo.Emprestado.Status;

public class Emprestimo {
    private Integer idEmprestimo;
    private Integer idAmigo;
    private java.sql.Date dataInicial;
    private java.sql.Date dataDevolucao;
    private Status status;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private ArrayList<Ferramenta> ferramentasSelecionadas;
    private final EmprestimoDAO dao;

    // Construtor padrão
    public Emprestimo() {
        this.ferramentasSelecionadas = new ArrayList<>();
        this.dao = new EmprestimoDAO();
    }

    // Construtor com parâmetros
    public Emprestimo(Integer idAmigo, java.sql.Date dataInicial, java.sql.Date dataDevolucao, Status status, ArrayList<Ferramenta> ferramentasSelecionadas) {
        this.idAmigo = idAmigo;
        this.dataInicial = dataInicial;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.ferramentasSelecionadas = ferramentasSelecionadas != null ? ferramentasSelecionadas : new ArrayList<>();
        this.dao = null;
    }

    public Emprestimo(Integer idAmigo, java.sql.Date dataInicial, java.sql.Date dataDevolucao, ArrayList<Ferramenta> ferramentasSelecionadas) {
        this.idAmigo = idAmigo;
        this.dataInicial = dataInicial;
        this.dataDevolucao = dataDevolucao;
        this.ferramentasSelecionadas = ferramentasSelecionadas != null ? ferramentasSelecionadas : new ArrayList<>();
        this.dao = null;
    }

    public Emprestimo(Integer idEmprestimo, Integer idAmigo, java.sql.Date dataInicial, java.sql.Date dataDevolucao, Status status) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigo = idAmigo;
        this.dataInicial = dataInicial;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.dao = null;
    }

    public Emprestimo(Integer idEmprestimo, Integer idAmigo, java.sql.Date dataInicial, java.sql.Date dataDevolucao, Status status, Amigo amigo, ArrayList<Ferramenta> ferramentasSelecionadas) {
        this.idEmprestimo = idEmprestimo;
        this.idAmigo = idAmigo;
        this.dataInicial = dataInicial;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
        this.amigo = amigo;
        this.ferramentasSelecionadas = ferramentasSelecionadas != null ? ferramentasSelecionadas : new ArrayList<>();
        this.dao = null;
    }

    // Getters and setters
    public Integer getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Integer idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Integer getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(Integer idAmigo) {
        this.idAmigo = idAmigo;
    }

    public java.sql.Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(java.sql.Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public java.sql.Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(java.sql.Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public ArrayList<Ferramenta> getFerramentasSelecionadas() {
        System.out.print("tentou pegar");
        return ferramentasSelecionadas;
    }

    public void setFerramentasSelecionadas(ArrayList<Ferramenta> ferramentasSelecionadas) {
        System.out.print("definiu ferramenta");
        this.ferramentasSelecionadas = ferramentasSelecionadas;
    }

    // Adiciona uma ferramenta à lista de ferramentas selecionadas
    public void adicionarFerramenta(Ferramenta ferramenta) {
        if (ferramentasSelecionadas == null) {
            ferramentasSelecionadas = new ArrayList<>();
        }
        ferramentasSelecionadas.add(ferramenta);
    }

    // Remove uma ferramenta da lista de ferramentas selecionadas
    public void removerFerramenta(Ferramenta ferramenta) {
        if (ferramentasSelecionadas != null) {
            ferramentasSelecionadas.remove(ferramenta);
        }
    }

    // Métodos
    public ArrayList<Emprestimo> pegarLista() {
        return dao.listarEmprestimos();
    }

    public boolean inserirEmprestimo(int idAmigo, ArrayList<Ferramenta> ferramentasSelecionadas, java.sql.Date dataInicial, java.sql.Date dataDevolucao) {
        Emprestimo objeto = new Emprestimo(idAmigo, dataInicial, dataDevolucao, ferramentasSelecionadas);
        dao.salvarEmprestimo(objeto);
        return true;
    }

    public int qtdFerramentasEmprestimo(int id) {
        return dao.qtdFerremantas(id);
    }

    public long tempoRestante(java.util.Date dataInicial, java.util.Date dataDevolucao) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String dtInicialStr = sdf.format(dataInicial);
        String dtDevolucaoStr = sdf.format(dataDevolucao);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate dataInicialLD = LocalDate.parse(dtInicialStr, formatter);
        LocalDate dataDevolucaoLD = LocalDate.parse(dtDevolucaoStr, formatter);

        // Se você quer calcular os dias restantes a partir de hoje até a data de devolução
        long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), dataDevolucaoLD);

        return diasRestantes;
    }

    public double calculaTotalEmprestimo() {
        double totalEmprestimo = 0.0;
        for (Ferramenta ferramenta : ferramentasSelecionadas) {
            totalEmprestimo += ferramenta.getCusto();
        }
        return totalEmprestimo;
    }

    public Emprestimo pegaEmprestimo(int id) {
        return dao.carregaEmprestimo(id);
    }

    public boolean atualizaEmprestimo(Emprestimo emprestimo) {
        dao.atualizarEmprestimo(emprestimo);
        return true;
    }

    public ArrayList<Ferramenta> pegaListaFerramentas(int idEmprestimo) {
        return dao.pegaFerramentasEmprestimo(idEmprestimo);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        ArrayList<Ferramenta> ferramentas = pegaListaFerramentas(this.idEmprestimo);
        for (Ferramenta ferramenta : ferramentas) {
            valorTotal += ferramenta.getCusto();
        }
        return valorTotal;
    }

    public boolean deletarEmprestimo(int id) {
        return dao.deletarEmprestimo(id);
    }
}