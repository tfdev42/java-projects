package at.bfi.SortAndSearch;

public class Main {
    public static void main(String[] args) {
        // 1 dimensional int array mit initialisierung
        int[] zahlen = new int[]{8, 98, 67, 4, 3, 100, 23, 456};

        // Sortiere die Zahlen in Array mit BubbleSort
        System.out.println("Vorher (unsortiert):");
        Ausgabe(zahlen);
        System.out.println();
        Sort.BubbleSort(zahlen);
        System.out.println("Nachher (sortiert):");
        Ausgabe(zahlen);


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
