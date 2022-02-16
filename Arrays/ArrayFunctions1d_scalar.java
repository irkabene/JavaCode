public class ArrayFunctions1d_scalar{
    public static int min(int array[]){
        int length = array.length;
        int minimum = array[0];
        for(int i = 1; i < length; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }      
        }
        return minimum;
    }
    
    public static int minLocationFrom(int array[], int index){
        int length = array.length;
        int minimum = array[index];
        int minloc = index;
        for(int i = index+1; i < length; i++){
            if (array[i] < minimum){
                minimum = array[i];
                minloc = i;
            }
        }
        return minloc;
    }

    public static int sum(int array[]){
        int length = array.length;
        int athroisma = 0;
        for (int i = 0; i < length; i++){
            athroisma = athroisma + array[i];  
        }
        return athroisma;
    } 

    public static int sumZygos(int array[]){
        int length = array.length;
        int athroisma = 0;
        for (int i = 0; i < length; i = i + 2){
            athroisma = athroisma + array[i];  
            
        }
        return athroisma;
    } 

    public static int sumZygos2(int array[]){
        int length = array.length;
        int athroisma = 0;
        for (int i = 0; i < length; i++){
            if (i % 2 == 0){
                athroisma = athroisma + array[i];
            }
        }
        return athroisma;
    } 

    public static int sumMonos(int array[]){
        int length = array.length;
        int athroisma = 0;
        for (int i = 1; i < length; i = i + 2){
            athroisma = athroisma + array[i];  
            
        }
        return athroisma;
    } 

    public static void main(String[] args){
        // δημιουργουμε εναν μονοδιαστατο πινακα με συγκεκριμενες τιμες (απ τον χρηστη)
        int[] aa =  {1,2,3,4};
        // ας τεσταρουμε την sum kai thn min
        int bb = sum(aa);
        int cc = min(aa);
        
        System.out.println("Sum = " + bb + " and min = " + cc);
    }
}