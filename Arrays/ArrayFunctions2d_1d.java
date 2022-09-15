public class ArrayFunctions2d_1d{


    // 2017(kanoniki)/thema //

    public static int[] intRowMax (int[][] array){
        int rows = array.length;
        int[] result;
        result = new int[rows];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<rows; i++){
            for(int j=0; j<array[i].length; j++){
                if( array[i][j] > max){
                    max = array[i][j];
                }
            }
            result[i] = max;
            max = Integer.MIN_VALUE;
        }
    return result;
    }

    // 2015(epanaliptiki)/thema 1 

    public static boolean[] parityRowCheck (int[][] array){
        int rows= array.length;
        boolean[] result;
        result = new boolean[rows];
        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<array[i].length; j++){
                sum= sum + array[i][j];
            }
            if(sum%2==0){
                result[i]= false;
            } 
            else{
                result[i]= true;
            }
            sum=0;
        }
    return result;
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

    public static boolean[] largerThanRowCheck(int[][] a, int n){
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

    public static void main(String[] args){
        // δημιουργουμε εναν 3χ4 πινακα με συγκεκριμενες τιμες (απ τον χρηστη)
        int[][] aa = { {1,2,3,4}, {4,5,6,4}, {7,8,9,4} }; 
        // υπολογιζουμε το rowSum και το αποθηκευουμε σε μια μεταβλητη bb
        int[] bb = rowSum(aa);
        // η bb ειναι μονοδιαστατος πινακας, και δεν μπορουμε απλα να την τυπωσουμε
        // θα πρεπει να τυπωσουμε ενα ενα τα στοιχεια μεσα σε ενα for loop
        for (int i = 0; i < bb.length; i++){
            System.out.println(bb[i]);
        }

        // κανουμε το ιδιο και για να τεσταρουμε την rowMax
        int[] cc = intRowMax(aa);
        for (int i = 0; i < cc.length; i++){
            System.out.println(cc[i]);
        }
        
    }
}



