package dao;

import modelo.Amigo;
import java.sql.*;
import java.util.ArrayList;

public class AmigoDAO {
    private static final String INSERT_AMIGO_SQL = "INSERT INTO amigos (id, nome, telefone) VALUES (?, ?, ?)";
    private static final String SELECT_ALL_AMIGOS_SQL = "SELECT * FROM amigos";
    private static final String UPDATE_AMIGO_SQL = "UPDATE amigos SET nome = ?, telefone = ? WHERE id = ?";
    private static final String DELETE_AMIGO_SQL = "DELETE FROM amigos WHERE id = ?";
    private static final String SELECT_AMIGO_BY_ID_SQL = "SELECT * FROM amigos WHERE id = ?";
    private static final String MAX_ID_SQL = "SELECT MAX(id) AS max_id FROM amigos";

    public static void adicionarAmigo(Amigo amigo) throws SQLException {
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(INSERT_AMIGO_SQL)) {
            pstmt.setInt(1, amigo.getId());
            pstmt.setString(2, amigo.getNome());
            pstmt.setString(3, amigo.getTelefone());
            pstmt.executeUpdate();
        }
    }

    public static ArrayList<Amigo> getMinhaLista() throws SQLException {
        ArrayList<Amigo> amigos = new ArrayList<>();
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_AMIGOS_SQL);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Amigo amigo = new Amigo(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone"));
                amigos.add(amigo);
            }
        }
        return amigos;
    }

    public static void atualizarAmigo(Amigo amigo) throws SQLException {
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(UPDATE_AMIGO_SQL)) {
            pstmt.setString(1, amigo.getNome());
            pstmt.setString(2, amigo.getTelefone());
            pstmt.setInt(3, amigo.getId());
            pstmt.executeUpdate();
        }
    }

    public static void deletarAmigo(int id) throws SQLException {
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(DELETE_AMIGO_SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    public static Amigo buscarAmigoPorId(int id) throws SQLException {
        Amigo amigo = null;
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(SELECT_AMIGO_BY_ID_SQL)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    amigo = new Amigo(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone"));
                }
            }
        }
        return amigo;
    }

    public static int maiorID() throws SQLException {
        int maxId = 0;
        try (Connection conn = ConexaoDB.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(MAX_ID_SQL);
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                maxId = rs.getInt("max_id");
            }
        }
        return maxId;
    }
}