package arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] myIntArray = new int[10];

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first: " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last: " + firstTen[arrayLength-1]); // index 9
    }
}
