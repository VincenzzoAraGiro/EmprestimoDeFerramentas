package dao;

import dao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Emprestado.Status;

public class RelatorioDAO {

    public int getTotalFerramentasEmprestadas() {
        String sql = "SELECT COUNT(*) AS LabelTotalFerramentasEmprestadas FROM ferramentas_emprestadas";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("LabelTotalFerramentasEmprestadas");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public int getTotalEmprestimosAbertos() {
        String sql = "SELECT COUNT(*) AS LabelTotalEmprestimosAbertos FROM emprestimos WHERE status = 1";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("LabelTotalEmprestimosAbertos");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public int getTotalAmigosComEmprestimosAbertos() {
        String sql = "SELECT COUNT(DISTINCT id_amigo) AS LabelTotalAmigosAbertos FROM emprestimos WHERE status = 1";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("LabelTotalAmigosAbertos");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public int getTotalEmprestimosPendentes() {
        String sql = "SELECT COUNT(*) AS LabelTotalEmprestimosPendentes FROM emprestimos WHERE status = 3";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("LabelTotalEmprestimosPendentes");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public ArrayList<Emprestimo> getEmprestimosAtivos() {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "SELECT * FROM emprestimos WHERE status = 1";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.setIdEmprestimo(rs.getInt("id_emprestimo"));
                emprestimo.setIdAmigo(rs.getInt("id_amigo"));
                emprestimo.setDataInicial(rs.getDate("data_emprestimo"));
                emprestimo.setDataDevolucao(rs.getDate("data_devolucao"));
                emprestimo.setStatus(StatusEmprestimo.fromCodigo(rs.getInt("status")));
                emprestimos.add(emprestimo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return emprestimos;
    }

    public ArrayList<Emprestimo> getEmprestimosNaoDevolvidos() {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "SELECT * FROM emprestimos WHERE status = 3";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Emprestimo emprestimo = new Emprestimo();
                emprestimo.setIdEmprestimo(rs.getInt("id_emprestimo"));
                emprestimo.setIdAmigo(rs.getInt("id_amigo"));
                emprestimo.setDataInicial(rs.getDate("data_emprestimo"));
                emprestimo.setDataDevolucao(rs.getDate("data_devolucao"));
                emprestimo.setStatus(StatusEmprestimo.fromCodigo(rs.getInt("status")));
                emprestimos.add(emprestimo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return emprestimos;
    }

    public int getAmigoQueFezMaisEmprestimos() {
        String sql = "SELECT id_amigo, COUNT(*) AS totalEmprestimos FROM emprestimos GROUP BY id_amigo ORDER BY totalEmprestimos DESC LIMIT 1";
        try (Connection conexao = ConexaoDB.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("id_amigo");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    private static class StatusEmprestimo {
        public static Status fromCodigo(int codigo) {
            switch (codigo) {
                case 1:
                    return Status.ABERTO;
                case 2:
                    return Status.FECHADO;
                case 3:
                    return Status.EM_ATRASO;
                default:
                    throw new IllegalArgumentException("Código de status inválido: " + codigo);
            }
        }
    }
}