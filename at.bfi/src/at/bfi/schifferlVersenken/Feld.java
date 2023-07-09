package at.bfi.schifferlVersenken;

public class Feld {
    
    // - frei:boolean
    // - treffer:boolean
    // ------------------------
    // +Feld()
    // ------------------------
    // +setSchiff
    // +istFeldFrei():boolean
    // +hatEinSchiff():boolean
    // +wurdeGetroffen():boolean
    // +toString():String

    private boolean frei;
    private boolean treffer;

    public Feld() {
        this.frei = true;
        this.treffer = false;
    }

    public void setSchiff(){
        if (this.frei){
            this.frei = false;
            this.treffer = false;
        }
    }

    public boolean istFeldFrei(){
        return this.frei;
    }

    public boolean hatEinSchiff(){
        return this.frei == false;
    }

    public boolean hatTreffer(){
        return this.treffer;
    }

    public void wurdeGetroffen(){
        this.treffer = true;
    }

    @Override
    public String toString(){
        // frei: (Leerzeichen)
        // hat schiff und nicht getroffen: *
        // hat schiff und ist getroffen: X
        if (this.istFeldFrei()){
            return " ";
        }
        else if (this.hatTreffer()){
            return "X";
        }
        else return "*";
    }

    
}
