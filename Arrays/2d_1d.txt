## 2018(kanoniki)/thema 3##

public static int[] rowSum (int[][] array){
    int rows= array.length;
    int[] result;
    result = new int[rows];
    int sum=0;
    for(int i=0; i<rows; i++){
        for(int j=0; j<array[i].length; j++){
            sum= sum + array[i][j];
        }
        result[i]=sum;
        sum=0;
    }
 return result
}

## 2017(kanoniki)/thema 3##

public static int[] inRowMax (int[][] array){
    int rows= array.length;
    int[] result;
    result = new int[rows];
    int max=Integer.MIN_VALUE;
    for(int i=0; i<rows; i++){
        for(int j=0; j<array[i].length; j++){
            if( array[i][j]>max){
                max= array[i][j];
            }
        }
        result[i]=max;
        max=Integer.MIN_VALUE;
    }
 return result
}

## 2015(epanaliptiki)/thema 1##

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
 return result
}




