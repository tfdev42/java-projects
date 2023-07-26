package at.bfi.DBTest;

import java.sql.*;


public class Hauptprogramm {
    public static void main(String[] args) {


            
        DB db = new DB();

        // Daten Abfragen
        ResultSet alleProdukte = db.Abfrage("SELECT * FROM Produkt");
        AusgabeRS(alleProdukte, "Bezeichnung");

        ResultSet alleProduktgruppen = db.Abfrage("SELECT * FROM Produktgruppe");
        AusgabeRS(alleProduktgruppen, "Bezeichnung");

        String neuesProdukt = "INSERT INTO Produkt (Bezeichnung, Nettopreis, FKProduktgruppe)";
        neuesProdukt += " VALUES ('Hamburger Royal', 5.9, 1)";


        if (db.Aenderung(neuesProdukt)){
            System.out.println("-----".repeat(5));
            System.out.println("Produkt wurde erstellt");
            System.out.println("-----".repeat(5));
        } else {
            System.out.println("-----".repeat(5));
            System.out.println("Fehler beim erstellen");
            System.out.println("-----".repeat(5));
        }

        alleProdukte = db.Abfrage("SELECT * FROM Produkt");
        AusgabeRS(alleProdukte, "Bezeichnung");
        

        
    }

    private static void AusgabeRS(ResultSet rs, String Spalte){
        try {
            while (rs.next()){
                System.out.println(rs.getString(Spalte));
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
}
