package arrays;

import java.util.Arrays;
import java.util.Random;

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

        int[] newArray;
        // newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println("\n");
        

        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        System.out.println(Arrays.toString(objectArray));
        System.out.println();

        getRandomArray(5);
        
    }

    private static int[] getRandomArray(int len) {
         Random random = new Random();
         int[] newInt = new int[len];
         
         return newInt;
    }
}
