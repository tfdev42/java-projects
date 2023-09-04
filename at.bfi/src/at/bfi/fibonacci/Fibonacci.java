package at.bfi.fibonacci;

public class Fibonacci {
    
    public static long fibonacci(long pos){
        if (pos == 0){
            return 0;
        }

        if (pos == 1){
            return 1;
        }
        // long val1 = fibonacci(limit - 1);
        // long val2 = fibonacci(limit - 2);
        // long fib = val1 + val2;
        return fibonacci(pos - 1) + fibonacci(pos - 2);
        // System.out.printf("%d + %d = %d%n", val1, val2, fib);
        // return fib;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }



}
