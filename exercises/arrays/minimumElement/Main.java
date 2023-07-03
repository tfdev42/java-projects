package arrays.minimumElement;

import java.util.Arrays;
import java.util.Scanner;

// 1. Method.readIntegers: reads comma delimated list of numbers,
// entered by user from console. returns array containing entered numbers

// 2. Method.findMin: takes array as argument, returns minimum value found in array

// in Main:
//     call readIntegers -> print these out w/ java.utils.arrays
//     call findMin -> passing array from call readIntegers
//     print minimum element / which is returned from findMin

// Assume user only enters numbers / no validation needed

public class Main {
    public static void main(String[] args) {
        System.out.printf("The minimum value is %d%n.", findMin(readIntegers()));
        
    }

    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma seperated list of integers");
        String input = scanner.nextLine();
        scanner.close();
        String[] sA = input.split(",");
        int[] intArray = new int[sA.length];
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(sA[i]);
        }
        return intArray;

    }

    public static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
}
