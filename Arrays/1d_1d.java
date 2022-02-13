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
   for(int j = 0, j < 2; j++){
        for(int i = j * length; i < (j + 1) * length; i++){
            copy[i] = array[i];
        } 
   }
   return copy;
}

