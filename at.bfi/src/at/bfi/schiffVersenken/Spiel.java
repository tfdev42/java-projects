package at.bfi.schiffVersenken;

import java.util.Scanner;

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
		// System.out.println(spielA);

		Scanner sc = new Scanner(System.in);
		String Eingabe;

		do {
			System.out.println("Wo soll die Bombe platyiert werden?");

			System.out.print("X-Koordinate: ");
			Eingabe = sc.nextLine();
			int X = Integer.parseInt(Eingabe); // wandelt Zeichenkette in INT um

			System.out.print("Y-Koordinate: ");
			Eingabe = sc.nextLine();
			int Y = Integer.parseInt(Eingabe);

			if (spielA.Schuss(X, Y)){
				System.out.println("Treffer");
			}
			else {
				System.out.println("Daneben");
			}

			if (spielA.Gewonnen()){
				System.out.println("Du hast gewonnen!");
				System.out.println(spielA);
				Eingabe = "Nein";
			} else {
				System.out.println("Willst du weiter spielen? Y/N");
				Eingabe = sc.nextLine();

			}			

		}
		while (Eingabe.equals("Y") || Eingabe.equals("y") || Eingabe.equals("J") || Eingabe.equals("j"));
		

	}

}
