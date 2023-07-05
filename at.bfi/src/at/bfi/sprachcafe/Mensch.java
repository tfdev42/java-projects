package at.bfi.sprachcafe;

public class Mensch {
    private String vorname;
    private String nachname;
    private String spitzName;
    private String sprache;

    // Setters
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setSpitzName(String spitzName) {
        this.spitzName = spitzName;
    }
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    // Getters
    public String getVorname() {
        return this.vorname;
    }
    public String getNachname() {
        return this.nachname;
    }
    public String getSpitzName() {
        return this.spitzName;
    }
    public String getSprache() {
        return this.sprache;
    }
    
    
    // Constructors
    public Mensch() {
        this.setNachname(null);
        this.setVorname(null);
        this.setSprache("de");
        this.setSpitzName(null);
    }
    public Mensch(String vorname, String nachname) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
        //this.setSprache("de");
    }
    public Mensch(String vorname, String nachname, String sprache) {
        this(vorname, nachname);
        this.setSprache(sprache);
    }

    @Override
    public String toString() {
        return "Mensch [vorname=" + vorname + ", nachname=" + nachname + ", spitzName=" + spitzName + ", sprache="
                + sprache + "]";
    }

    public String vorstellen(){ 
        //System.out.println(reden());
        if (this.spitzName == null){
            switch (this.sprache){
                case "en":
                    return String.format("My full name is %s %s", this.vorname, this.nachname);
                    
                case "st":
                    return String.format("Mei noam is %s %s", this.vorname, this.nachname);
                    
                default:
                    return String.format("Mein voller name ist %s %s", this.vorname, this.nachname);
            }
        } else {
            return String.format("Mein Spitzname ist %s%n", this.spitzName);
        }
    }


    public String reden(){
        
        if (this.sprache == "de"){
            vorstellen();
            return ("Ich rede deutch");
        } else if (this.sprache == "en"){
            vorstellen();
            return ("I'm talking in english");
        } else {
            vorstellen();
            return ("I rea auf Steirisch");
        }
        
    }
    




    
    
    
    
}
