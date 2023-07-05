package at.bfi.sprachcafe;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Mensch m1 = new Mensch();
        m1.setSpitzName("Hugo");
        m1.setVorname("Tom");
        System.out.println(m1.vorstellen());

        Sprachcafe sc = new Sprachcafe(3);
        sc.addMensch(m1);
        System.out.println(sc.toString());

        Mensch m2 = new Mensch();
        m2.setNachname("Maier");
        m2.setVorname("Tim");
        m2.setSprache("en");
        sc.addMensch(m2);
        System.out.println(sc.toString());

        Mensch m3 = new Mensch();
        Mensch m4 = new Mensch();
        m3.setSpitzName("Pezzi");
        m3.setSprache("st");
        sc.addMensch(m3);
        //sc.addMensch(m4);

        System.out.println("-".repeat(40));
        // System.out.println(m3.vorstellen());

        // Arrays.toString(sc.reden());
        //System.out.println(sc.getAnzahlMenschen());
        System.out.println(sc.toString());
        String gerede = sc.reden();
        System.out.println(gerede);
    }
}
