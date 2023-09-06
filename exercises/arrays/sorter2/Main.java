package arrays.sorter2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] reversedArray = getRandReversedIntArray(1000);
        //System.out.println(Arrays.toString(getRandIntArray(10)));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
        System.out.println("Execution Time: " + executionTime + " milliseconds");


        // long startTime = System.currentTimeMillis();
        // -----
        // long endTime = System.currentTimeMillis();
        // long executionTime = endTime - startTime;
        // System.out.println("Execution Time: " + executionTime + " milliseconds");
        
    }

    private static int[] getRandReversedIntArray(int len){
        Random random = new Random();
        int[] randIntArray = new int[len];
        for (int e = 0; e < len; e++) {
            randIntArray[e] = random.nextInt(100);
        }
        
        System.out.println(Arrays.toString(randIntArray));
        Arrays.sort(randIntArray);

        int[] reversedArray = new int[randIntArray.length];
        int index = reversedArray.length - 1;
        for (int i = 0; i < reversedArray.length; i++){
            reversedArray[i] = randIntArray[index];
            index--;
        }
        return reversedArray;
    }
}
