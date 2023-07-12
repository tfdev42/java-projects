package at.bfi.schiffVersenken;


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

	private boolean PruefeKoordinaten(int posX, int posY){
		return posX >= 1 && posY >= 1 && Brett != null && posX <= Brett[0].length && posY <= Brett.length;
	}
	
	public void PlatziereSchiff(int posX, int posY) {
		if (PruefeKoordinaten(posX, posY)){
			//Achtung: posX und posY auf Index umrechnen!
			this.Brett[posY-1][posX-1].setSchiff();
		}
		
	}
	
	public boolean Schuss(int posX, int posY) {
		//Achtung: posX und posY auf Index umrechnen!
		if (PruefeKoordinaten(posX, posY)){
			if (this.Brett[posY-1][posX-1].hatEinSchiff()) {
				this.Brett[posY-1][posX-1].wurdeGetroffen();	
				return true;
			}
		
		}
		return false;
		
	}

	public boolean Gewonnen(){

		boolean Sieg = true;

		if (this.Brett != null){
			for (int i=0; i<this.Brett.length; i++) {
				for (int j=0; j<this.Brett[i].length; j++) {
					if (this.Brett[i][j].hatEinSchiff() && !this.Brett[i][j].hatTreffer()){
						Sieg = false;
						break;
					}
				}				
			}
		}
		return Sieg;

	}

	@Override
	public String toString() {
		String Result = "";
		
		if (this.Brett != null){
			for (int i=0; i<this.Brett.length; i++) {
				for (int j=0; j<this.Brett[i].length; j++) {
					Result += this.Brett[i][j];
				}
				
				Result += "\n"; // Ende der Zeile
			}
		}
		else {
			Result = "Kein Spielfeld vorhanden.";
		}
		
		
		return Result;
	}
	
	
}
