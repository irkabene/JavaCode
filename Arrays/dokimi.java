class Epanaliptiki2022{

    public static int[][] keepOddRows(int[][] a){
        int rows = a.length;
        // int cols = a[rows-1].length;
        int[][] b;
        int rowsB;
        if(rows%2==0){
            rowsB = rows / 2;
        }
        else{
            rowsB = (rows+1)/2;
        }

        b = new int[rowsB][];

        for(int i=0; i<rows ; i=i+2){
            b[i/2] = new int[a[i].length];
            for(int j=0; j< a[i].length ; j++){
                b[i/2][j]=a[i][j];
            }
        }
    }


    public static int[] rowSum(int[][] a){
        int rowsA = a.length;
        int[] b;
        b = new int[rowsA];
        int sum=0;
        for(int i=0; i<rowsA ; i++){
            for(int j=0 ; j< a[i].length ;j++){
                sum = sum + a[i][j];
                
            }
            b[i] = sum;
            sum=0;
        }
        return b;
    }


    public static boolean[] largerThan(int[][] a, int n){
        int rowsA = a.length;
        boolean[] b;
        b = new boolean[rowsA];
        int max = Integer.MIN_VALUE;
        
        for(int i=0 ; i< rowsA ; i++){
            for(int j=0; j< a[i].length ; j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
            if(max > n){
                b[i] = true;
            }
            else{
                b[i] = false;
            }
            max = Integer.MIN_VALUE;
        }
        return b;      
    }



    public static boolean[] largerThan_break(int[][] a, int n){
        int rowsA=a.length;
        boolean[] b;
        b = new boolean[rowsA];

        for(int i=0; i<rowsA ; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j] > n){
                    b[i] = true;
                    break;
                }
                else{
                    b[i] = false;
                }
            } 

        }
        return b;
    }

}