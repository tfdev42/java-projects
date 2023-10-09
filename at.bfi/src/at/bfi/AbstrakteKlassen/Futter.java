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
        return vegetarisch;
    }

    public boolean getIstLeer(){
        return this.bestand == 0;
    }


    public Futter(String bezeichnung, boolean vegetarisch) {
        this.bezeichnung = bezeichnung;
        this.vegetarisch = vegetarisch;
    }

    
    
}
