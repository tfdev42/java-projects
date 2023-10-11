package at.bfi.AbstrakteKlassen;

public class Futter {
    private int bestand;
    private String bezeichnung;
    private boolean vegetarisch;

    
    public int getBestand() {
        return bestand;
    }


    public String getBezeichnung() {
        return bezeichnung;
    }


    public boolean isVegetarisch() {
        return this.vegetarisch;
    }

    public boolean getIstLeer(){
        return this.bestand == 0;
    }


    public Futter(String bezeichnung, boolean vegetarisch) {
        this.bezeichnung = bezeichnung;
        this.vegetarisch = vegetarisch;
        this.bestand = 0;
    }

    public boolean verbrauchen(int bedarf){
        if (this.bestand >= bedarf) {
            this.bestand -= bedarf;
            return true;
        }
        System.out.printf("Bestand ist kleiner als bedarf. Bestand ist %s", getBestand());
        return false;
    }

    public void auffuellen(int menge){        
        if (menge >= 0){
            this.bestand += menge;
        }
    }
    @Override
    public String toString(){
        String result = this.bezeichnung + ", " + this.bestand + " Einheiten";
        if (this.isVegetarisch()){
            result += " (vegetarisch)";
        }
        return result;
    }
    
}
