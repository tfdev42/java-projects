package at.bfi.vererbungPerson;

public class Mitarbeiter extends Person {

    private String abteilung;

    public Mitarbeiter(String vName, String nName, String abteilung) {
        super(vName, nName);
        this.abteilung = abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getAbteilung() {
        return this.abteilung;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + " Abteilung: " + abteilung;
    }
    
}
