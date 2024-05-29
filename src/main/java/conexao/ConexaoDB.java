package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    public static Connection getConexao() {
        Connection connection = null; 
        try {
           
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            // Configurar a conexão
            String server = "localhost"; 
            String database = "db_emprestimos"; 
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root"; // Usuário do banco de dados
            String password = "Morango358017#"; // Senha do banco de dados

            // Estabelece a conexão
            connection = DriverManager.getConnection(url, user, password);

            // Testa a conexão
            if (connection != null) {
                System.out.println("Status: Conexão Sucedida!");
            } else {
                System.out.println("Status: Conexão Falhou!");
            }

            return connection;

        } catch (ClassNotFoundException e) { // Driver não encontrado
            System.out.println("O driver não pôde ser encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) { 
            System.out.println("Conexão perdida, tente novamente mais tarde...");
            return null;
        }
    }
}
