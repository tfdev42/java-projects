package at.bfi.password;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		
		//Passwort max. 3x falsch eingeben
				int AnzFalsch = 0;
				boolean OK = false;
				String Passwort;
				Scanner Eingabe = new Scanner(System.in);
				
				
				do {
					//Eingabe
					System.out.print("Bitte dein passwort: ");
					Passwort = Eingabe.next();//"hallo";
//					Class<?> objClass = Passwort.getClass();
//					System.out.println("Type of obj: " + objClass.getName());
					
					if (Passwort.equals("geheim")) {
						OK = true;
					}
					else {
						AnzFalsch++;
						System.out.println(AnzFalsch + ". Mal falsch eingegeben.");
					}
				}
				while (OK == false && AnzFalsch < 3);
				Eingabe.close();
	}

}
