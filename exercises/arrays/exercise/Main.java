package arrays.exercise;

public class Main {
    public static void main(String[] args) {
        // SortedArray.printArray(SortedArray.sortIntegers(SortedArray.getIntegers(5)));
        System.out.println("_".repeat(20));
        System.out.printf("The minimum value is %d%n.", MinimumElement.findMin(MinimumElement.readElements(MinimumElement.readInteger())));
    }
}
