package at.bfi.AbstrakteKlassen;

public class Main {
    public static void main(String[] args) {
        Futter silo = new Futter("Maissilo", true);
        System.out.println(silo);


        Katze susi = new Katze("Susi");
        Rind paula = new Rind("Paula", false);

        System.out.println(susi);
        System.out.println(paula);
    }
}
