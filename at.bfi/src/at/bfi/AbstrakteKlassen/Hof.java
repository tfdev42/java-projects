package at.bfi.AbstrakteKlassen;

public class Hof {
    private Futter[] vorrat;
    private Tier[] tiere;

    public Hof(int maxTiere){
        if (maxTiere > 0){
            tiere = new Tier[maxTiere]; // maxTiere als Parameter
        }
    }

    // Startvorrat am Hof
    vorrat = new Futter[4];
    vorrat[0] = new Futter("Silo", true);
    vorrat[1] = new Futter("Wasser", true);
    vorrat[2] = new Futter("Katzenfutter", true);
    vorrat[3] = new Futter("Heu", true);

    vorrat[0].auffuellen(14);
    vorrat[1].auffuellen(100);
    vorrat[2].auffuellen(3);
    vorrat[3].auffuellen(40);
    

    public void vorratAuffuellen() {
        for (Futter f : vorrat) {
            if (f.getIstLeer()){
                f.auffuellen(25);
            } else {
                f.auffuellen(f.getBestand()*2);
            }
        }
    }


    public void alleTiereHabenGeburtstag() {
        for (Tier t : tiere) {
            t.altern();
        }
    }

    public String toString(){
        String result;

        result = "\n--------- Tiere am Hof ---------\n";
        for (Tier t : tiere){
            result += t + "\n";
        }

        result += "\n--------- Tiere am Hof ---------\n";
        for (Tier t : tiere){
            result += t + "\n";
        }

        return result;


    }


}
