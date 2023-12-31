package arrays.sorter;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] reversedArray = getRandIntArray(10);
        //System.out.println(Arrays.toString(getRandIntArray(10)));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
        System.out.println("Execution Time: " + executionTime + " milliseconds");
        
    }

    private static int[] getRandIntArray(int len){
        Random random = new Random();
        int[] randIntArray = new int[len];
        for (int e = 0; e < len; e++) {
            randIntArray[e] = random.nextInt(100);
        }
        
        System.out.println(Arrays.toString(randIntArray));
        Arrays.sort(randIntArray);

        int left = 0;
        int right = randIntArray.length - 1;

        // loop sorter while true
        while (left <= right) {
            int temp = randIntArray[left];
            randIntArray[left] = randIntArray[right];
            randIntArray[right] = temp;
            
            left++;
            right--;
        }        
        return randIntArray;
    }
}
