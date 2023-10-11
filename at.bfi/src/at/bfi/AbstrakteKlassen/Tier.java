package at.bfi.AbstrakteKlassen;

public abstract class Tier {
    protected String name;
    protected int alter;

    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }

    public void altern(){
        this.alter += 1;
    }

    

    protected Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public abstract void fressen(Futter mahl);

    
}
