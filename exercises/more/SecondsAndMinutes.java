package more;

public class SecondsAndMinutes {
    
    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) System.out.println("Invalid Value");
        else {
            int hours = minutes / 60;
            int newMinutes = minutes % 60;
            System.out.printf("%dh %dm %ds\n", hours, newMinutes, seconds);
        }

    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) System.out.println("Invalid Value");
        else {
            int minutes = seconds / 60;
            int newSeconds = seconds % 60;
            getDurationString(minutes, newSeconds);
        }
        
    }


}
