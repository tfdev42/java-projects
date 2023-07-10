package at.bfi;


public class Spielfeld {
	private Feld[][] Brett;
	
	public Spielfeld(int Breite, int Hoehe) {
		//1. Array erstellen
		this.Brett = new Feld[Hoehe][Breite];
		
		//2. Jedes Feld erstellen
		for (int i=0; i<this.Brett.length; i++) {
			for (int j=0; j<this.Brett[i].length; j++) {
				this.Brett[i][j] = new Feld();
			}
		}
	}
	
	public void PlatziereSchiff(int posX, int posY) {
		if (posX >= 1 && posY >= 1 && posX <= Brett[0].length && posY <= Brett.length){
			//Achtung: posX und posY auf Index umrechnen!
			this.Brett[posY-1][posX-1].setSchiff();
		}
		
	}
	
	public boolean Schuss(int posX, int posY) {
		//Achtung: posX und posY auf Index umrechnen!
		if (this.Brett[posY-1][posX-1].hatEinSchiff()) {
			this.Brett[posY-1][posX-1].wurdeGetroffen();	
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String Result = "";
		
		for (int i=0; i<this.Brett.length; i++) {
			for (int j=0; j<this.Brett[i].length; j++) {
				Result += this.Brett[i][j];
			}
			
			Result += "\n"; // Ende der Zeile
		}
		
		return Result;
	}
	
	
}
