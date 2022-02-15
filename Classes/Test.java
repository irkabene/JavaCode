 class  Test {
    public static void main(String args[]){
       int result =  factorial(10);
        System.out.println(result);
    }

    public static int factorial(int n){

        if(n==0){
            return 1;
        }
        else {
            return factorial(n-1)*n;
        }
        

    }
    
    // public static int factorial2(int n){
    //     int result=1;
    //     if(n==0){
    //         return 1;
    //     }
    //     else{
    //         for(int i=1; i<n; i++){
    //             result = result*i;
    //         }
    //     }
    // }


} 





