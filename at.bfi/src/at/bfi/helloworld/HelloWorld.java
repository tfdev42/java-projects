package at.bfi.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		// 2 variablen INT, >> add >> print
		int value1 = 1; // initialisierung ... int value1; >> Deklaration
		int value2 = 5;
		int sum = value1 + value2;
		System.out.println("1. zahl: " + value1 + " + 2. Zahl: " + value2 + " ist: " + sum);
		System.out.printf("1.Zahl: %d + 2.Zahl: %d = %d", value1, value2, sum);
		System.out.println();
		
		// SUM x=17 / max 37
		int Sum = 0;
		int start = 17;
		int anzahl = 20;
		int max = anzahl + start; // extra variable deklarieren um laufzeit niedrig zu halten
		
		for (int i = start; i <= max; i++) {
			
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			Sum += i;
		}
		System.out.println();
		System.out.println("Summe: " + Sum);
	}

}
