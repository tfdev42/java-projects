package at.bfi.factorial;

public class Main {
    public static void main(String[] args) {
        int number = 20;
        long factorial = Factorial.factorial(number);
        System.out.printf("%d! is %d%n",number, factorial);
    }
}
