package at.bfi.vererbungPerson;

public class Person {
    protected String vName;
    protected String nName;

    public Person(String vName, String nName){
        this.nName = nName;
        this.vName = vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getvName() {
        return this.vName;
    }

    public String getnName() {
        return this.nName;
    }

    @Override
    public String toString() {
        return "Vorname=" + this.vName + ", Nachname=" + this.nName;        
    }
    
}
