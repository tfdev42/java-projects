package at.bfi.personen;

public class Person {
    
    private String name;
    private int anzTaenze;

    
    // Constructors
    public Person() {
        this.setName("Unbekannt");
        this.anzTaenze = 0;
    }

    public Person(String name) {
        //this.name = name;
        this.setName(name);
        this.anzTaenze = 0;
    }



    // Setters Getters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzTaenze() {
        return this.anzTaenze;
    }

    public void setAnzTaenze(int anzTaenze){
        this.anzTaenze = anzTaenze;
    }
    

    // METHODS
    public void tanzen() {
        this.anzTaenze++;
        
    }

    @Override
    public String toString() {
        return String.format("%s hat %d mal getanzt", name, anzTaenze);
    }

    
}
