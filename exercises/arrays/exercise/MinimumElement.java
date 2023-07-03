package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

// Minimum Element

// Write a method called readInteger() that has no parameters and returns an int.

// It needs to read in an integer from the user - this represents how many elements the user needs to enter.


// Write another method called readElements() that has one parameter of type int

// The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.


// And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.


// The scenario is:

// 1. readInteger() is called.

// 2. The number returned by readInteger() is then used to call readElements().

// 3. The array returned from readElements() is used to call findMin().

// 4. findMin() returns the minimum number.

// [Do not try and implement this. It is to give you an idea of how the methods will be used]


// TIP: Assume that the user will only enter numbers, never letters.

// TIP: Instantiate (create) the Scanner object inside the method. There are two scanner objects, one for each of the two methods that are reading in input from the user.

// NOTE: Do not add a main method to the solution code.


public class MinimumElement {

    public static int readInteger(){
        System.out.println("How many integers?");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        // scanner.close(); --->>> this throws java.util.NoSuchElementException
        return len;
    }

    public static int[] readElements(int len){
        int[] array = new int[len];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < len; i++){            
            System.out.printf("Enter element %d:%n", i);
            int input = scanner.nextInt();
            array[i] = input;
            
        }
        scanner.close();
        return array;
    }

    public static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
    
}
