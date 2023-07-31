package at.bfi.DBShop;

public class Produkt {
    private long produktID;
    private String bezeichnung;
    private float nettopreis;
    private long produktgruppe;


    public Produkt(long ProduktID, String Bezeichnung, float Nettopreis, long Produktgruppe) {
        produktID = ProduktID;
        bezeichnung = Bezeichnung;
        nettopreis = Nettopreis;
        produktgruppe = Produktgruppe;
    }

    public Produkt(String Bezeichnung, float Nettopreis, long Produktgruppe){
        this(0, Bezeichnung, Nettopreis, Produktgruppe);
    }

    public String toString(){
        return bezeichnung + " kostet " + nettopreis
            + " Euro netto und gehoert zur Produktgruppe " + produktgruppe
            + " (Produkt-Nr.: " + produktID + ")";
    }

    public long getProduktID() {
        return produktID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public float getNettopreis() {
        return nettopreis;
    }

    public long getProduktgruppe() {
        return produktgruppe;
    }

    

    
    
}
