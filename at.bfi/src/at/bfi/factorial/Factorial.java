package at.bfi.factorial;

public class Factorial {

    public static long factorial(long number){
        if (number <= 1) return 1;

        return number * factorial(number - 1);
    }
    
}
