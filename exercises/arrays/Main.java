package arrays;

import java.util.Arrays;
import java.util.Collections;
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

        // -----------------------------------------------------------------------
        int[] newArray;
        // newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i; // fill it with {5, 4, 3, 2, 1}
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
        objectArray[2] = Arrays.toString(newArray);

        System.out.println(Arrays.toString(objectArray));
        System.out.println();
        // -----------------------------------------------------------------------

        int[] randArray = getRandomArray(10);
        System.out.println(Arrays.toString(randArray));
        Arrays.sort(randArray);
        System.out.println(Arrays.toString(randArray));


        int[] fillArray = new int[10];
        System.out.println(Arrays.toString(fillArray));
        Arrays.fill(fillArray, 5);
        System.out.println(Arrays.toString(fillArray));

        int[] secondRandArray = getRandomArray(10);
        System.out.println(Arrays.toString(secondRandArray));

        int[] copyArray = Arrays.copyOf(secondRandArray, secondRandArray.length);
        System.out.println(Arrays.toString(copyArray));

        int[] smallerArray = Arrays.copyOf(secondRandArray, 5);
        Arrays.sort(smallerArray);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(secondRandArray, 15);
        System.out.println(Arrays.toString(largerArray));
        System.out.println();

        // -----------------------------------------------------------------------

        String[] sArr = {"Dea", "Abe", "Bee", "Cea", "Edi"};
        Arrays.sort(sArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(sArr));
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));
        if (Arrays.binarySearch(sArr, "Bee") > 0) {
            System.out.println("Found Bee");
        }


        int[] s1 = {1,2,3,4,5};
        int[] s2 = {5,2,3,4,1};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are NOT equal");
        }


        
    }

    private static int[] getRandomArray(int len) {
         Random random = new Random();
         int[] newInt = new int[len];
         for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
         }

         return newInt;
    }
}
