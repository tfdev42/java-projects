package at.bfi.SortAndSearch;

public class Sort {
    
    public static void bubbleSort(int[] zahlen){
        for (int n = zahlen.length; n > 1; n--){
            for (int i=0; i<n-1; i++){
                if (zahlen[i] > zahlen[i+1]){
                    tauschen(zahlen, i, i+1);
                }
            }
        }
    }

    private static void tauschen(int[] zahlen, int pos1, int pos2){
        int temp = zahlen[pos1];
        zahlen[pos1] = zahlen[pos2];
        zahlen[pos2] = temp;
    }

    public static void bubbleSortBoolean(int[] zahlen){
        for (int n = zahlen.length; n > 1; n--){
            boolean swapped = false;
            for (int i=0; i < n-1; i++){
                if (zahlen[i] > zahlen[i+1]){
                    tauschen(zahlen, i, i+1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void quickSort(int[] zahlen){
        // Aufruf des eigentlichen QuickSort
        qs(zahlen, 0, zahlen.length-1);
    }

    // Der QuickSort Algortihmus
    private static void qs(int[] zahlen, int links, int rechts){
        if (links < rechts) {
            // pivot element
            int teiler = teile(zahlen, links, rechts);
            // rekursiver aufruf fuer linken Teil
            qs(zahlen, links, teiler - 1);
            // rekursiver aufruf fuer rechten Teil
            qs(zahlen, teiler + 1, rechts);
        }

    }

    private static int teile(int[] zahlen, int links, int rechts){
        int i = links;
        int j = rechts - 1;
        int pivot = zahlen[rechts];

        // Solange sich beide Positionen nicht ueberlappen
        while (i < j) {
            // Suche von rechts nach links die Position des Elements,
            // das groesser als das Pivot-Element ist
            // Pos i darf pos j nicht ueberschreiten + umgekehrt
            while (i < j && zahlen[i] <= pivot){
                i++;
            }

            while (j > i && zahlen[j] > pivot){
                j--;
            }

            if (zahlen[i] > zahlen[j]) tauschen(zahlen, i, j);
        }

        if (zahlen[i] > pivot) {
            tauschen(zahlen, i, rechts);
        } else i = rechts;

        return i;

    }


}
