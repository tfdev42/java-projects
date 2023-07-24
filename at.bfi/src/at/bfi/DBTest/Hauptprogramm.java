package at.bfi.DBTest;

import java.sql.*;


public class Hauptprogramm {
    public static void main(String[] args) {

        try {
            

            // Daten Abfragen
            ResultSet resultSet = null;
            
            Statement statement = connection.createStatement();

            // Create and execute a SELECT SQL statement
            String selectSql = "SELECT * FROM Produkt";

            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()){
                System.out.println(resultSet.getString("Bezeichnung"));
            }



        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
