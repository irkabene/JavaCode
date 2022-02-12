public static int[][] clone (int[][] array){
    int rows = array.length;
    int cols = array[0].length;
    int[][] copy;
    copy = new int[rows][cols];
    for(int i = 0; i < rows; i++ ){
        for(int j = 0; j < cols; j++){
            copy[i][j] = array[i][j]
         }
    }   
    return copy
}

// 2017(epanaliptiki)/ thema3##
public static int[][] keepOddRows(int[][] a){
    int rowsA= a.length;
    int rowsB;
     if(rowsA % 2 == 0){
        rowsB = rowsA / 2;
    }
    else{
        rowsB = (rowsA + 1) / 2;
    }

    int[][] b;
    b = new int[rowsB][];
    for(int i = 0; i < rowsA; i = i + 2){
        b[i] = new int[a[i].length];
         for(int j = 0; j < a[i].length; j++){
            b[i/2][j] = a[i][j];
        }
    }



    return b