package at.bfi.sprachcafe;

import java.util.Arrays;

public class Main {

    private static Sprachcafe sc;

    private static void MenschenKommenInsCafe(){
        Mensch m1 = new Mensch();
        sc.addMensch(m1);
        m1.setSpitzName("Hugo");
        m1.setVorname("Tom");
        

        Mensch m2 = new Mensch();
        m2.setNachname("Maier");
        m2.setVorname("Tim");
        m2.setSprache("en");
        sc.addMensch(m2);

        Mensch m3 = new Mensch();
        Mensch m4 = new Mensch();
        m3.setSpitzName("Pezzi");
        m3.setSprache("st");
        sc.addMensch(m3);       

    }

    private static void alleRedenST() {
        for (int i=0; i<sc.getAnzahlMenschen(); i++ ){
            
        }
        
    }
    public static void main(String[] args) {
        
        sc = new Sprachcafe(3);

        MenschenKommenInsCafe();
        System.out.println(sc.toString());


        // alle Menschen sollen ST reden

        
    
    }
}
