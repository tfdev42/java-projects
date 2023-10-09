package at.bfi.AbstrakteKlassen;

public class Tier {
    public String name;
    public int alter;

    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }

    public void altern(){
        this.alter += 1;
    }

    

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void fressen(Futter futter, int menge){
        // TODO
    }

    
}
