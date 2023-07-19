package at.bfi.vererbungPerson;

public class Kunde extends Person{

    private int kundeID;

    public Kunde(String vName, String nName, int kundeID) {
        super(vName, nName);
        this.kundeID = kundeID;
    }

    public void setKundeID(int kundeID) {
        // fuer einen neue KundenID
        this.kundeID = kundeID;
    }

    public int getKundeID() {
        return kundeID;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " KundeID: " + kundeID;
    }

    

    

    
    
}
