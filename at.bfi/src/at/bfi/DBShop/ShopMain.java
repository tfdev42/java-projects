package at.bfi.DBShop;

import java.sql.SQLException;
import java.util.List;

public class ShopMain {
    
    public static void main(String[] args){
        ProduktManager pm = new ProduktManager();
        List<Produkt> alleProdukte = pm.getAlleProdukte();

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
