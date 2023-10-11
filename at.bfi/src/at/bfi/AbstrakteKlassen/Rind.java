package at.bfi.AbstrakteKlassen;

public class Rind extends Tier{

    private boolean behornt;

    public Rind(String name, boolean behornt){
        super(name, 0);
        this.behornt = behornt;
    }

    @Override
    public void fressen(Futter mahl){

    }

    @Override
    public String toString(){
        String result = "Rind '" + name + "' ist" + alter + " Jahre alt";

        if (behornt) {
            result += " und behornt.";
        }
        else {
            result += " ohne Horn.";
        }
        return result;
    }
    
}
