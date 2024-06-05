package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Ferramenta;

public class FerramentaDAO {

    // Método para adicionar uma nova ferramenta ao banco de dados
    public void adicionarFerramenta(Ferramenta ferramenta) throws SQLException {
        String sql = "INSERT INTO ferramentas(nome, marca, custo_aquisicao) VALUES(?, ?, ?)";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ferramenta.getNome());
            pstmt.setString(2, ferramenta.getMarca());
            pstmt.setDouble(3, ferramenta.getCustoAquisicao());
            pstmt.executeUpdate();
        }
    }

    // Método para listar todas as ferramentas do banco de dados
    public List<Ferramenta> listarFerramentas() throws SQLException {
        List<Ferramenta> ferramentas = new ArrayList<>();
        String sql = "SELECT * FROM ferramentas";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Ferramenta ferramenta = new Ferramenta(rs.getInt("id"), rs.getString("nome"), rs.getString("marca"), rs.getDouble("custo_aquisicao"));
                ferramentas.add(ferramenta);
            }
        }
        return ferramentas;
    }

    // Método para buscar uma ferramenta pelo ID
    public Ferramenta buscarFerramentaPorId(int id) throws SQLException {
        Ferramenta ferramenta = null;
        String sql = "SELECT * FROM ferramentas WHERE id = ?";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    ferramenta = new Ferramenta(rs.getInt("id"), rs.getString("nome"), rs.getString("marca"), rs.getDouble("custo_aquisicao"));
                }
            }
        }
        return ferramenta;
    }

    // Método para atualizar uma ferramenta existente no banco de dados
    public void atualizarFerramenta(Ferramenta ferramenta) throws SQLException {
        String sql = "UPDATE ferramentas SET nome = ?, marca = ?, custo_aquisicao = ? WHERE id = ?";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ferramenta.getNome());
            pstmt.setString(2, ferramenta.getMarca());
            pstmt.setDouble(3, ferramenta.getCustoAquisicao());
            pstmt.setInt(4, ferramenta.getId());
            pstmt.executeUpdate();
        }
    }

    // Método para deletar uma ferramenta do banco de dados
    public void deletarFerramenta(int id) throws SQLException {
        String sql = "DELETE FROM ferramentas WHERE id = ?";
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }
}
