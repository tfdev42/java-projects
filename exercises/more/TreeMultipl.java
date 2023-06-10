package more;

class TreeMultipl {

    public static void treeViewOfMultiplication(int multiplicant) {
            
        for (int i=1; i<=10; i++){
            int result = i * multiplicant;
            System.out.printf("%d x %d = ", i, multiplicant);
            if (i > 1){
                for(int n=1; n<i; n++){
                    System.out.printf("%d + ", multiplicant);
                };           
            }
            System.out.printf("%d = %d%n", multiplicant, result);
        }
    }

    
}


