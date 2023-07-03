package at.bfi.sprachcafe;

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
        sc.addMensch(m2);
        System.out.println(sc.toString());

        sc.reden();
    }
}
