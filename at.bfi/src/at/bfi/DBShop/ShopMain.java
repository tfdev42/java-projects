package at.bfi.DBShop;

import java.sql.SQLException;
import java.util.List;

public class ShopMain {
    
    public static void main(String[] args){
        ProduktManager pm = new ProduktManager();
        List<Produkt> alleProdukte = pm.getAlleProdukte();

        Ausgabe(alleProdukte);

        System.out.println("*".repeat(66));

        Produkt lattella = new Produkt("Latella natur", 0.89f, 2);
        if (pm.erstelleProdukt(lattella)){
            System.out.println("Produkt wurde erstellt.");

            alleProdukte = pm.getAlleProdukte();
            Ausgabe(alleProdukte);
        }else {
            System.out.println("Produkt konnte nicht erstellt werden.");
        }

        System.out.println("*".repeat(66));

        Produkt p17 = pm.getProduktByID(17);
        if (p17 != null){
            System.out.println("Produkt 17 ist: " + p17);
        }else{
            System.out.println("Es gibt kein Produkt mit Nummer 17.");
        }

        // Produkt17 erhaelt eine Preiserhoehung von 20%
        //p17.setNettopreis(p17.getNettopreis()*1.2f);
        //pm.speichereProdukt(p17);
        
        //Produkt p14 = pm.getProduktByID(14);
        //p14.setNettopreis(p14.getNettopreis()*1.2f);
        //pm.speichereProdukt(p14);
        
        System.out.println("*".repeat(66));

        alleProdukte = pm.getAlleProdukte();
        Ausgabe(alleProdukte);
        System.out.println("*".repeat(66));

        if (pm.entferneProdukt(13)){
            System.out.println("Produkt erfolgreich entfernt");

            alleProdukte = pm.getAlleProdukte();
            Ausgabe(alleProdukte);
        }else{
            System.out.println("Produkt konnte nicht entfernt werden.");
        }

        
    }

    private static void Ausgabe(List<Produkt> alleProdukte){
        if(alleProdukte != null && alleProdukte.size() > 0){

            System.out.printf("Wir haben %d Produkte im Sortiment.%n", alleProdukte.size());

            for (Produkt p : alleProdukte){
                System.out.println(p);
            }
        }else{
            System.out.println("Keine Produkte gelistet");
        }
    }



}
