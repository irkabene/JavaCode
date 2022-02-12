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
    int minimum = arrray[index];
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

