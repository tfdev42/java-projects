package at.bfi.DBTest;
import java.sql.*;

public class DB {
    private Connection connection;

    public DB(){
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String connectionUrl =
                "jdbc:sqlserver://localhost;"
                + "database=shop;"
                + "user=bfi;"
                + "password=bfi;"
                + "encrypt=false;";

            this.connection = DriverManager.getConnection(connectionUrl);

        } catch (SQLException ex) {
            this.connection = null;
            
        }
    }

    public ResultSet Abfrage(String sql){
        // Daten abfragen
        ResultSet resultSet = null;
        try {
            Statement statement = this.connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            resultSet = null;
        }
        return resultSet;
    }

}
