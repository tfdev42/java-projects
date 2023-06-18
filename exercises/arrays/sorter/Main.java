package arrays.sorter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandIntArray(10)));
        
    }

    private static int[] getRandIntArray(int len){
        Random random = new Random();
        int[] randIntArray = new int[len];
        for (int e = 0; e < len; e++) {
            randIntArray[e] = random.nextInt(100);
        }
        //Arrays.sort(randIntArray);
        System.out.println(Arrays.toString(randIntArray));
        Arrays.sort(randIntArray);

        return randIntArray;
    }
}
