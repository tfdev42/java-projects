package more;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // We have to wake up if the dog is barking before 8 or after 22 hours >> TRUE
        // In all other cases return false.
        // If the hourOfDay parameter is less than 0 or greater than 23 return false.
        // the hourOfDay parameter needs to be in a range 0-23

        boolean wakeUp = false;
       
        if (hourOfDay < 0 || hourOfDay > 23 || !barking || hourOfDay > 7 && hourOfDay < 23){
            wakeUp = false;
        }else {
            wakeUp = true;
        }
        return wakeUp;


    }
}
