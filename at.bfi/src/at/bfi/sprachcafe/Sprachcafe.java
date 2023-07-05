package at.bfi.sprachcafe;

import java.util.Arrays;

public class Sprachcafe {
    private Mensch[] menschen;
    private int anzahlMenschen;

    

    public int getAnzahlMenschen() {
        return this.anzahlMenschen;
    }

    public Sprachcafe() {
        this.menschen = new Mensch[20];
        this.anzahlMenschen = 0;
    }

    public Sprachcafe(int maxAnzahlMenschen) {
        this();
        if (maxAnzahlMenschen >= 2 && maxAnzahlMenschen <= 20){
            this.menschen = new Mensch[maxAnzahlMenschen];
            this.anzahlMenschen = 0;
        }
        
    }

    public void addMensch(Mensch neuerMensch){
        if (this.anzahlMenschen < this.menschen.length){
            this.menschen[this.anzahlMenschen] = neuerMensch;
            this.anzahlMenschen++;
        }
        

    }

    // public String[] reden() {
    //     String[] geraede = new String[this.anzahlMenschen];
    //     for (int i = 0; i < geraede.length; i++){
    //         String t = "";
    //         // Mensch m = (Mensch) menschen[i];
    //         // m.reden();
    //         geraede[i] = t + this.menschen[i].reden();
    //     }
    //     return geraede;
    // }

    public String reden(){
        String Ergebnis = "";

        for (int i=0; i<this.anzahlMenschen; i++){
            Ergebnis = Ergebnis + this.menschen[i].reden() + "\n";
        }
        return Ergebnis;
    }

    
    @Override
    public String toString() {
        return "Sprachcafe [menschen=" + Arrays.toString(menschen) + ", anzahlMenschen=" + anzahlMenschen + "]";
    }

    public String vorstellen() {
        String ergebnis = "";

        for (int i = 0; i < this.anzahlMenschen; i++){
            ergebnis = ergebnis + this.menschen[i].vorstellen() + "\n";
        }
        return ergebnis;
    }

    

    

    
}
