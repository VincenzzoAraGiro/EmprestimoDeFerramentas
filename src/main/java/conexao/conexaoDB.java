package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDB {

    public static Connection getConexao() {
        Connection connection = null; 
        try {
           
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            // Configura a conexão
            String server = "localhost"; // Caminho do MySQL
            String database = "db_emprestimos"; // Nome do banco de dados
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root"; // Usuário do banco de dados
            String password = "Vemprofut1#"; // Senha do banco de dados

            // Estabelece a conexão
            connection = DriverManager.getConnection(url, user, password);

            // Testa a conexão
            if (connection != null) {
                System.out.println("Status: Conexão estabelecida!");
            } else {
                System.out.println("Status: Conexão Perdida!");
            }

            return connection;

        } catch (ClassNotFoundException e) { // Exceção para driver não encontrado
            System.out.println("O driver não pôde ser encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) { // Exceção para erro de conexão com o banco
            System.out.println("Conexão perdida, tente novamente mais tarde...");
            return null;
        }
    }
}
