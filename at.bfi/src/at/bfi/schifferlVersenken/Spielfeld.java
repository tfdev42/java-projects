package at.bfi.schifferlVersenken;

import java.util.Arrays;

public class Spielfeld {
    private int[][] feld;

    public Spielfeld(int breite, int hoehe) {
        this.feld = new int[breite][hoehe];
    }

    public void PlatziereSchiff(int posX, int posY){

    }

    public boolean Schuss(int posX, int posY){

    }

    public boolean istFeldFrei(int posX, int posY){

    }

    @Override
    public String toString() {
        return "Spielfeld [feld=" + Arrays.toString(feld) + "]";
    }

    

    
}
