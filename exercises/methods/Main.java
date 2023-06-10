package methods;

public class Main {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
        
        System.out.println("The highScore is " + calculateScore(true, 10000, 8, 200));
        
		/*
		 * score = 10000; levelCompleted = 8; bonus = 200; finalScore = score;
		 * 
		 * if (gameOver) { finalScore += (levelCompleted * bonus);
		 * System.out.println("Your final score was " + finalScore); }
		 */

	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		/*
		 * boolean gameOver = true; int score = 800; int levelCompleted = 5; int bonus =
		 * 100;
		 */

        int finalScore = score;
        
        if (gameOver) {
        	finalScore += (levelCompleted * bonus);
        	// System.out.println("Your final score was " + finalScore);
        }
		return finalScore;
	}

}
