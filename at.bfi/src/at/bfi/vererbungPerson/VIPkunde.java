package at.bfi.vererbungPerson;

public class VIPkunde extends Kunde {

    private String bonusKlasse;

    public VIPkunde(String vName, String nName, int kundeID, String bonusKlasse) {
        super(vName, nName, kundeID);
        this.bonusKlasse = bonusKlasse;
    }

    public void setBonusKlasse(String bonusKlasse) {
        this.bonusKlasse = bonusKlasse;
    }

    public String getBonusKlasse() {
        return this.bonusKlasse;
    }

    @Override
    public String wasTustDu(){
        return "Ich hole mein Geschenk ab.";
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " Bonusklasse: " + bonusKlasse;
    }

    

    
    
}
