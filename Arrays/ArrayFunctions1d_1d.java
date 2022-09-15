public class ArrayFunctions1d_1d{
   
   public static int[] clone(int array[]){
      int length = array.length;
      int[] copy;
      copy = new int[length];
      for(int i = 0; i < length; i++){
         copy[i] = array[i];
      } 
      return copy;
   }

   public static int[] concatenationHorizontal(int row[], int n){
      // previously --> cloneDouble
      // Στην matlab θα θελαμε 
      // [row,row] --> concatenation
      // e.g string concatenation --> 'hel','lo' --> 'hello'
      // e.g row = [1,2,3] --> [1,2,3,1,2,3]
      int length = row.length;
      int[] copy;
      copy = new int[n * length];
      for(int j = 0; j < n; j++){
         for(int i = j * length; i < (j + 1) * length; i++){
               // i = 0 - length
               // i = length - 2*length
               copy[i] = row[i - j * length];
         } 
        
      }
      return copy;
   }

   
   public static int[][] concatenationVertical(int row[],int n){
      // Matlab equivalent
      // [row;row;,....;row]
      // input dimension --> 1 x length
      // output dimension --> n x length
      // array = [1,2,3,4,5]
      // copy =  [1,2,3,4,5;
      //          1,2,3,4,5;
      //          1,2,3,4,5;
      //          .
      //          .
      //          .]
      int length = row.length;
      int[][] copy;
      copy = new int[n][length];
      for(int i=0; i<n ;i++){
         for(int j=0; j<length;j++){
            copy[i][j]=row[j];
         }
      }
      return copy;
   }







   public static void main(String[] args){
      // δημιουργουμε εναν μονοδιαστατο πινακα με συγκεκριμενες τιμες (απ τον χρηστη)
      int[] aa =  {1,2,3,4};
      // ας τεσταρουμε την clone
      // int[] antigrafo = clone(aa);
      
      // for (int i = 0; i < aa.length; i++){
      //    if (aa[i] == antigrafo[i]){
      //       System.out.println("Η θεση " + i + " ειναι ιδια και ίση με " + aa[i]);
      //    }
      //    else{
      //       System.out.println("Η θεση " + i + " ειναι Διαφορετικη");
      //    }
      // }

      // as testaroume tis concatenate
      int n = 5;
      int[] concatH = concatenationHorizontal(aa, n);
      int[][] concatV = concatenationVertical(aa, n);

      for (int i = 0; i < concatH.length; i++){
         System.out.print(concatH[i]);
      }

      System.out.println("");

      for (int i = 0; i < concatV.length; i++){
         for (int j = 0; j < concatV[i].length; j++){
            System.out.print(concatV[i][j]);
         }
         System.out.println("");
      }
   }
}

