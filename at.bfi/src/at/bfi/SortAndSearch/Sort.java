package at.bfi.SortAndSearch;

public class Sort {
    
    public static void BubbleSort(int[] zahlen){
        for (int n = zahlen.length; n > 1; n--){
            for (int i=0; i<n-1; i++){
                if (zahlen[i] > zahlen[i+1]){
                    Tauschen(zahlen, i, i+1);
                }
            }
        }
    }

    private static void Tauschen(int[] zahlen, int pos1, int pos2){
        int temp = zahlen[pos1];
        zahlen[pos1] = zahlen[pos2];
        zahlen[pos2] = temp;
    }

    public static void BubbleSortBoolean(int[] zahlen){
        for (int n = zahlen.length; n > 1; n--){
            boolean swapped = false;
            for (int i=0; i < n-1; i++){
                if (zahlen[i] > zahlen[i+1]){
                    Tauschen(zahlen, i, i+1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


}
