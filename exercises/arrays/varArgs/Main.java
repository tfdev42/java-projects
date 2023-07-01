package arrays.varArgs;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(20));
        printText();

        
    }

    private static void printText(String... textToPrint){
        for (String t : textToPrint){
            System.out.println(t);
        }
    }
}
