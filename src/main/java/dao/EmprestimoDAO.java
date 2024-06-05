import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {
    private List<Emprestimo> emprestimos;

    public EmprestimoDAO() {
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    public List<Emprestimo> getEmprestimosAtivos() {
        List<Emprestimo> emprestimosAtivos = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataDevolucao() == null) {
                emprestimosAtivos.add(emprestimo);
            }
        }
        return emprestimosAtivos;
    }

    public List<Emprestimo> getTodosEmprestimos() {
        return this.emprestimos;
    }

    public List<Emprestimo> getEmprestimosPorAmigo(Amigo amigo) {
        List<Emprestimo> emprestimosPorAmigo = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getAmigo().equals(amigo)) {
                emprestimosPorAmigo.add(emprestimo);
            }
        }
        return emprestimosPorAmigo;
    }

    public Amigo amigoComMaisEmprestimos() {
        // Implemente a lógica para encontrar o amigo com mais empréstimos
        // Retorna o amigo com o maior número de empréstimos
        return null;
    }

    public List<Emprestimo> emprestimosNaoDevolvidos() {
        List<Emprestimo> emprestimosNaoDevolvidos = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataDevolucao() == null) {
                emprestimosNaoDevolvidos.add(emprestimo);
            }
        }
        return emprestimosNaoDevolvidos;
    }
}
