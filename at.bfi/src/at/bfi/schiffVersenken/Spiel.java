package at.bfi;

public class Spiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Spielfeld erstellen (5x5)
		Spielfeld spielA = new Spielfeld(5, 5);
		
		//Schiffe platzieren
		spielA.PlatziereSchiff(1, 3);
		spielA.PlatziereSchiff(2, 1);
		
		spielA.Schuss(1, 1);
		spielA.Schuss(1, 2);
		spielA.Schuss(1, 3);
		
		//2. Spielfeld am Bildschirm ausgeben
		System.out.println(spielA);
	}

}
