package at.bfi.SortAndSearch;

public class Main {
    public static void main(String[] args) {
        // 1 dimensional int array mit initialisierung
        int[] zahlen = new int[]{8, 98, 67, 4, 3, 100, 23, 456};

        // Sortiere die Zahlen in Array mit BubbleSort

        long startTime = System.currentTimeMillis();
        System.out.println("Vorher (unsortiert):");
        Ausgabe(zahlen);
        System.out.println();
        Sort.bubbleSort(zahlen);
        System.out.println("Nachher (Bubble-sortiert):");
        Ausgabe(zahlen);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("\nExecution Time: " + executionTime + " milliseconds");
        System.out.println();
        System.out.println("*".repeat(30));
        
        // Sortiere die Zahlen in Array mit BubbleSortBoolean
        int[] zahlen1 = new int[]{8, 98, 67, 4, 3, 100, 23, 456};
        startTime = System.currentTimeMillis();
        System.out.println("Vorher (unsortiert):");
        Ausgabe(zahlen1);
        System.out.println();
        Sort.bubbleSortBoolean(zahlen1);
        System.out.println("Nachher (BubbleBool-sortiert):");
        Ausgabe(zahlen1);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("\nExecution Time: " + executionTime + " milliseconds");
        System.out.println();
        System.out.println("*".repeat(30));

        // Sortiere die Zahlen in Array mit Quicksort
        zahlen = new int[]{8, 98, 67, 4, 3, 100, 23, 456};
        startTime = System.currentTimeMillis();
        System.out.println("Vorher (unsortiert):");
        Ausgabe(zahlen);
        System.out.println();
        Sort.quickSort(zahlen);
        System.out.println("Nachher (Quick-sortiert):");
        Ausgabe(zahlen);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("\nExecution Time: " + executionTime + " milliseconds");
        System.out.println();


        // Suche nach der Zahl 1 und nach der Zahl 8
        if (Search.binarySearch(zahlen, 1)){
            System.out.println("Zahl 1 gefunden");
        } else {
            System.out.println("Zahl 1 nicht gefunden");
        }

        if (Search.binarySearch(zahlen, 8)){
            System.out.println("Zahl 8 gefunden");
        } else {
            System.out.println("Zahl 8 nicht gefunden");
        }
        
        System.out.println("*".repeat(30));
        // Suche nach der Zahl 1 und nach der Zahl 8
        if (Search.linearSearch(zahlen, 1)){
            System.out.println("Zahl 1 gefunden");
        } else {
            System.out.println("Zahl 1 nicht gefunden");
        }

        if (Search.linearSearch(zahlen, 8)){
            System.out.println("Zahl 8 gefunden");
        } else {
            System.out.println("Zahl 8 nicht gefunden");
        }


    }

    public static void Ausgabe(int[] zahlen){
        //gibt alle Elemente mit Komma getrennt aus
        for (int i = 0; i < zahlen.length; i++){
            System.out.print(zahlen[i]);
            // merken >>>>
            if (i < zahlen.length-1){
                System.out.print(", ");
            }
        }
    }


}
