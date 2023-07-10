package at.bfi;

public class Feld {

	private boolean frei;
	private boolean treffer;
	
	public Feld() {
		this.frei = true;
		this.treffer = false;
	}
	
	//Merkt sich, dass auf sich selbst ein Schiff steht
	public void setSchiff() {
		this.frei = false;
		this.treffer = false;
	}
	
	public boolean istFeldFrei() {
		return this.frei;
	}
	
	public boolean hatEinSchiff() {
		return this.frei == false;
	}
	
	public boolean hatTreffer() {
		return this.treffer;
	}
	
	public void wurdeGetroffen() {
		this.treffer = true;
	}

	@Override
	public String toString() {
		// frei: (Leerzeichen)
		// Hat Schiff und nicht getroffen: *
		// Hat Schiff und ist getroffen: X
		if (this.istFeldFrei()) {
			return ".";
		}
		else if (this.hatTreffer()) {
			return "X";
		}
		else return "*";
	}
	
	
}
