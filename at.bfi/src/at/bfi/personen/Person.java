package at.bfi.personen;

public class Person {
    
    private String name;

    

    public Person() {
        this.setName("Unbekannt");
    }

    public Person(String name) {
        //this.name = name;
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
