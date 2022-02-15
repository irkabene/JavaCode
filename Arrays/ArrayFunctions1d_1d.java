class Test_1d_1d{
   
   public static int[] clone(int array[]){
      int length = array.length;
      int[] copy;
      copy = new int[length];
      for(int i = 0; i < length; i++){
         copy[i] = array[i];
      } 
      return copy;
   }

   public static int[] cloneDouble(int array[]){
      int length = array.length;
      int[] copy;
      copy = new int[2 * length];
      for(int j = 0; j < 2; j++){
         for(int i = j * length; i < (j + 1) * length; i++){
               copy[i] = array[i];
         } 
      }
      return copy;
   }

   public static void main(String[] args){
      // δημιουργουμε εναν μονοδιαστατο πινακα με συγκεκριμενες τιμες (απ τον χρηστη)
      int[] aa =  {1,2,3,4};
      // ας τεσταρουμε την clone
      int[] antigrafo = clone(aa);
      
      for (int i = 0; i < aa.length; i++){
         if (aa[i] == antigrafo[i]){
            System.out.println("Η θεση " + i + " ειναι ιδια και ίση με " + aa[i]);
         }
         else{
            System.out.println("Η θεση " + i + " ειναι Διαφορετικη");
         }
      }
      
   }
}

