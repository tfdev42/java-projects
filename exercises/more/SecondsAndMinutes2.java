package more;

public class SecondsAndMinutes2 {

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid Value";
        long hours = minutes / 60;
        long newMinutes = minutes % 60;
        return String.format("%dh %dm %ds\n", hours, newMinutes, seconds);     
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) return "Invalid Value";
        long minutes = seconds / 60;
        long newSeconds = seconds % 60;
        return getDurationString(minutes, newSeconds);     
    }

}
