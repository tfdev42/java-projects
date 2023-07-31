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
    
    public boolean erstelleProdukt (Produkt neu){
        String insertSql = "INSERT INTO Produkt(Bezeichnung, Nettopreis, FKProduktgruppe) "
                        + " VALUES (?, ?, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(insertSql);
            stmt.setString(1, neu.getBezeichnung());
            stmt.setFloat(2, neu.getNettopreis());
            stmt.setLong(3, neu.getProduktgruppe());
            
            return stmt.executeUpdate() == 1; // wenn ertellt kommt 1
        } catch (Exception e) {
            return false;
        }
        
    }

    public Produkt getProduktByID(long produktID){
        String sql = "SELECT * FROM Produkt WEHRE ProduktID=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, produktID);

            ResultSet rs = stmt.executeQuery();
            rs.next(); // muss 1x next() damit man auf den Datensatz kommt
            // ToDo; pruefen ob ueberhaupt ein Datensatz gefunden wurde
            Produkt p = new Produkt(rs.getLong("ProduktID"),
                                    rs.getString("Bezeichnung"),
                                    rs.getFloat("Nettopreis"),
                                    rs.getLong("FKProduktgruppe")
            );
            return p;
            
        } catch (Exception e) {
            return null;
        }
        
        
    }

    public boolean speichereProdukt (Produkt neu){
        String updateSql = "UPDATE SET Bezeichnung=?, Nettopreis=?, FKProduktgruppe=?) "
                        + " WHERE ProduktID=?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(updateSql);
            stmt.setString(1, neu.getBezeichnung());
            stmt.setFloat(2, neu.getNettopreis());
            stmt.setLong(3, neu.getProduktgruppe());
            stmt.setLong(4, neu.getProduktID());
            
            return stmt.executeUpdate() == 1;
        } catch (Exception e) {
            return false;
        }
        
    }

    public boolean entferneProdukt (long ProduktID){
        String deleteSql = "DELETE FROM Produkt WHERE ProduktID=?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(deleteSql);
            stmt.setLong(1, ProduktID);
            
            return stmt.executeUpdate() == 1;
        } catch (Exception e) {
            return false;
        }
        
    }

}
