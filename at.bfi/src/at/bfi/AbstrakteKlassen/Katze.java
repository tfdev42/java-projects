package at.bfi.AbstrakteKlassen;

public class Katze extends Tier {

    public Katze(String name) {
        super(name, 0);
    }

    

    @Override
    public void fressen(Futter mahl) {
        mahl.verbrauchen(2);
    }



    @Override
    public String toString() {
        return "Katze " + this.name + " ist " + this.alter + " Jahre alt";
    }
    
}
