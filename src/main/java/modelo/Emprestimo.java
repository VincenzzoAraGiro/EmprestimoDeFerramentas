import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ferramenta {
    private String nome;
    private String marca;
    private double custo;

    public Ferramenta(String nome, String marca, double custo) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
    }

    // Getters and Setters
}

public class Amigo {
    private String nome;
    private String telefone;

    public Amigo(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters and Setters
}

public class Emprestimo {
    private Ferramenta ferramenta;
    private Amigo amigo;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Ferramenta ferramenta, Amigo amigo, Date dataEmprestimo) {
        this.ferramenta = ferramenta;
        this.amigo = amigo;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e Setters
}

public class SistemaEmprestimo {
    private List<Ferramenta> ferramentas;
    private List<Amigo> amigos;
    private List<Emprestimo> emprestimos;

    public SistemaEmprestimo() {
        ferramentas = new ArrayList<>();
        amigos = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void cadastrarFerramenta(Ferramenta ferramenta) {
        ferramentas.add(ferramenta);
    }

    public void cadastrarAmigo(Amigo amigo) {
        amigos.add(amigo);
    }

    public void registrarEmprestimo(Ferramenta ferramenta, Amigo amigo, Date dataEmprestimo) {
        Emprestimo emprestimo = new Emprestimo(ferramenta, amigo, dataEmprestimo);
        emprestimos.add(emprestimo);
    }

    public void registrarDevolucao(Emprestimo emprestimo, Date dataDevolucao) {
        emprestimo.setDataDevolucao(dataDevolucao);
    }

    // Outros métodos para gerar relatórios conforme as necessidades do seu tio-avô
}

public class Main {
    public static void main(String[] args) {
        SistemaEmprestimo sistema = new SistemaEmprestimo();

        // Exemplo de cadastro de ferramentas e amigos
        sistema.cadastrarFerramenta(new Ferramenta("Martelo", "Tramontina", 30.0));
        sistema.cadastrarFerramenta(new Ferramenta("Chave de fenda", "Stanley", 20.0));

        sistema.cadastrarAmigo(new Amigo("João", "123456789"));
        sistema.cadastrarAmigo(new Amigo("Maria", "987654321"));

        // Exemplo de registro de empréstimo
        Ferramenta martelo = sistema.getFerramentas().get(0);
        Amigo joao = sistema.getAmigos().get(0);
        sistema.registrarEmprestimo(martelo, joao, new Date());

        // Exemplo de registro de devolução
        Emprestimo emprestimo = sistema.getEmprestimos().get(0);
        sistema.registrarDevolucao(emprestimo, new Date());

        // Implemente os métodos necessários para gerar os relatórios
    }
}