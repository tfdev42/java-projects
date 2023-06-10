package methods;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tom", 500);
        System.out.println("New score is " + newScore);
        newScore = calculateScore(75);
        System.out.println("New score is " + newScore);
        calculateScore();
        
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name, No Player Score");
        return 0;
    }
}
