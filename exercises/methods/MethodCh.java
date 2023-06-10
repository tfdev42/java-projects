package methods;

public class MethodCh {

	public static void main(String[] args) {
		
		// System.out.printf("Name: %s, Age: %d, Height: %.2f", name, age, height);
		
		String name = "John";
		int highScore = 99;
		
		
		displayHighScorePosition(name, highScore);
		
		displayHighScorePosition(name, 1500);
		
		displayHighScorePosition("Jim", 1000);
		
		displayHighScorePosition(name, 500);
		
		displayHighScorePosition("Kat", 100);
		
		displayHighScorePosition(name, 25);
		
		displayHighScorePosition("Test", -19);
		

	}
	
	
	public static void displayHighScorePosition(String name, int highScore) {
		System.out.printf("%s managed to get into position %d on the high score list!\n", name, calculateHighScorePosition(highScore));
	}
	
	public static int calculateHighScorePosition(int highScore) {
		
		if (highScore >= 1000) {
			return 1;
		}else if (highScore >= 500) {
			return 2;
		}else if (highScore >= 100) {
			return 3;
		}
		return 4;
		
		
	}
	

}
