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

    public String reden() {
        String geraede = " ";
        for (Mensch m : this.menschen) geraede += String.format(m.reden());
        return geraede;
    }

    
    public String toString() {
        String str = Arrays.toString(this.menschen);
        return str;
    }

    public String vorstellen() {
        String ergebnis = "";

        for (int i = 0; i < this.anzahlMenschen; i++){
            ergebnis = ergebnis + this.menschen[i].vorstellen() + "\n";
        }
        return ergebnis;
    }

    

    

    
}
