package more;

public class FeetInchToCentimeter {
    
    public static double calcFeetInchToCentimeter(double feet, double inches) {
        double cm;
        
        if (feet < 0 
        || inches < 0 
        || inches > 12) return -1;
        else{
            cm = feet * 30.48 + inches * 2.54;
        }
        return cm;
    }

    public static double calcFeetInchToCentimeter(double inches) {
        
        if ( inches < 0 ) return -1;
        else{
            int feet = (int) inches / 12;
            double newInches = inches % 12;
            return calcFeetInchToCentimeter(feet, newInches);
        }
        

    }
}
