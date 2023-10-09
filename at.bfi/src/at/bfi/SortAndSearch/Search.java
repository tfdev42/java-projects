package at.bfi.SortAndSearch;

public class Search {
    
    public static boolean binarySearch(int[] zahlen, int nummer){
        // funktion bs liefert den INdex, wenn gefunden / sonst -1
        int result = bs(zahlen, nummer, 0, zahlen.length - 1);
        return result > -1;

    }

    private static int bs(int[] zahlen, int nummer, int links, int rechts){
        
        if (rechts >= links){
            int mitte = links + (rechts - links) / 2;

            if (zahlen[mitte] == nummer) return mitte;

            if (nummer < zahlen[mitte]) return bs(zahlen, nummer, links, mitte - 1);

            if (nummer > zahlen[mitte]) return bs(zahlen, nummer, mitte + 1, rechts);
        }

        return -1;
    }

    public static boolean linearSearch(int[] zahlen, int such){
        // + linearSearch(Zahlen;int[], such:int):boolean
        // - ls(Zahlen: int[]):int
        int result = ls(zahlen, such);
        return result > -1;
    }

    private static int ls(int[] zahlen, int such){
        for (int i=0; i<zahlen.length; i++) {
            if (such == zahlen[i]) {return i;}
            
        }
        return -1;
    }


}
