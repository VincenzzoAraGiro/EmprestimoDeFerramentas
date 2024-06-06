package dao;

import modelo.Emprestimo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class EmprestimoDAO {

    // Método para registrar um novo empréstimo no banco de dados
    public void adicionarEmprestimo(Emprestimo emprestimo) throws SQLException {
        String sql = "INSERT INTO emprestimos(id_amigo, id_ferramenta, data_emprestimo, data_devolucao) VALUES(?, ?, ?, ?)";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, emprestimo.getIdAmigo());
            pstmt.setInt(2, emprestimo.getIdFerramenta());
            pstmt.setDate(3, new Date(emprestimo.getDataEmprestimo().getTime()));
            pstmt.setDate(4, emprestimo.getDataDevolucao() != null ? new Date(emprestimo.getDataDevolucao().getTime()) : null);
            pstmt.executeUpdate();
        }
    }

    // Método para listar todos os empréstimos do banco de dados
    public List<Emprestimo> listarEmprestimos() throws SQLException {
        List<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "SELECT * FROM emprestimos";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Emprestimo emprestimo = new Emprestimo(
                        rs.getInt("id_emprestimo"),
                        rs.getInt("id_amigo"),
                        rs.getInt("id_ferramenta"),
                        rs.getDate("data_emprestimo"),
                        rs.getDate("data_devolucao")
                );
                emprestimos.add(emprestimo);
            }
        }
        return emprestimos;
    }

    // Método para buscar um empréstimo pelo ID
    public Emprestimo buscarEmprestimoPorId(int id) throws SQLException {
        Emprestimo emprestimo = null;
        String sql = "SELECT * FROM emprestimos WHERE id_emprestimo = ?";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    emprestimo = new Emprestimo(
                            rs.getInt("id_emprestimo"),
                            rs.getInt("id_amigo"),
                            rs.getInt("id_ferramenta"),
                            rs.getDate("data_emprestimo"),
                            rs.getDate("data_devolucao")
                    );
                }
            }
        }
        return emprestimo;
    }

    // Método para atualizar um empréstimo existente no banco de dados
    public void atualizarEmprestimo(Emprestimo emprestimo) throws SQLException {
        String sql = "UPDATE emprestimos SET id_amigo = ?, id_ferramenta = ?, data_emprestimo = ?, data_devolucao = ? WHERE id_emprestimo = ?";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, emprestimo.getIdAmigo());
            pstmt.setInt(2, emprestimo.getIdFerramenta());
            pstmt.setDate(3, new Date(emprestimo.getDataEmprestimo().getTime()));
            pstmt.setDate(4, emprestimo.getDataDevolucao() != null ? new Date(emprestimo.getDataDevolucao().getTime()) : null);
            pstmt.setInt(5, emprestimo.getIdEmprestimo());
            pstmt.executeUpdate();
        }
    }

    // Método para deletar um empréstimo do banco de dados
    public void deletarEmprestimo(int id) throws SQLException {
        String sql = "DELETE FROM emprestimos WHERE id_emprestimo = ?";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
