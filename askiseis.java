public class askiseis {

    
    public static int  f(int n) {
        if (n==0){
            return 1;
        }
        else if(n==1){
            return 2;
        }
        else if(n==3){
            return 1;
        }
        else{
            return f(n-1)*2 + f(n-2)/f(n-3);
        }
        
    }

    public static int exams (int m1,int m2,int m3,int m4){
        int mo=(m1+m2+m3+m4)/4;
        int moria= mo*1000;
        return moria;
    }
    public static int exams2(int[] bathmoi, int[] vari){
        int mathimata = bathmoi.length;
        int sum=0;
        for(int i=0; i<mathimata; i++){
            sum= sum + bathmoi[i] * vari[i];
        }
        return (sum/mathimata)*1000;
    }

    public static boolean isCube(int n){
        for(int i=1; i<n; i++){
            if(i*i*i==n){
                return true;
            }
        }
        return false;
    }

    public static int[][] triangle(){
        int rows=3;
        int cols=4;
        int[][] array2 = new int[rows][];
        for(int i=0; i<rows ; i++){
            array2[i] = new int[i+1] ;
        }
        return array2;
     }

    // 2014 kanonikh(theme 4)
    public static void rightTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j>=n-1-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    } 
    //parallagi
    public static char[][] rightTriangle2 (int n){
        char[][] pinakas = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j>=n-1-i){
                    pinakas[i][j] = '*';          
                }
                else{
                    pinakas[i][j] = ' ';
                }
            }
        } 
        return pinakas;
    } 

    //isSubSet
    public static int isSubSet(int[] a, int[] b){
        for(int i=0; i<a.length-b.length ; i++){
            for(int j=0; j<b.length; j++){
                if(a[i+j]!=b[j]){
                    break;
                }
                else{
                   if(j==b.length -1) {
                        return i;
                   }
                }
            }
        }
        return -1;
    }
    //isSubString
    public static int isSubString(String a, String b){
        for(int i=0; i<a.length()-b.length() ; i++){
            for(int j=0; j<b.length(); j++){
                if(a.charAt(i+j)!=b.charAt(j)){
                    break;
                }
                else{
                    if(j==b.length() -1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    


    public static void main(String[] args){
        int m1 =15;
        int m2 = 18;
        int m3 = 19;
        int m4 =20;
        int temp = exams(m1,m2,m3,m4);
        System.out.println("moria " + temp );
        boolean lol = isCube(m2);
        int n= 10;
        rightTriangle(n);
        char[][] triangle = rightTriangle2(n);
        
    }
}
