package at.bfi.DBShop;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduktManager {

    private Connection connection;

    public ProduktManager(){
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



    public List<Produkt> getAlleProdukte(){

        List<Produkt> result = new ArrayList<Produkt>();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produkt ORDER BY Bezeichnung");
            Produkt p;

            while (rs.next()){
                p = new Produkt(rs.getLong("ProduktID"), rs.getString("Bezeichnung"), rs.getFloat("Nettopreis"), rs.getLong("FKProduktgruppe"));
                result.add(p);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
        
    }
    
}
