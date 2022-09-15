public class MathFunctions{
    public static int factorial(int n){
        // αναδρομή -->  5! = 1*2*3*4*5 = 4! * 5
        if (n == 0){
            // 1o Σκελος
            return 1;
        } else{
            // 2ο Σκελος
            return n * factorial(n-1);
        }
    }

    public static int fib(int n){
        if (n == 0){
            // 1o Σκελος a
            return 1;
        } else if (n == 1){
            // 1o Σκελος b
            return 1;
        } else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static int powerOf2(int n){
        if (n == 0){
             return 1;
        } else{
            // 2ο Σκελος
            return 2 * powerOf2(n-1);
        }
    }

    public static int modulo(int n, int a){
        
        while (n-a >= 0){
            n = n -a;
        }
        return n;

    }

    public static int gcd(int a, int b){
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }
        if (a > b){
            return gcd(a - b, b);
        } else {
            return gcd(b - a, a);
        }
    }

    public static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }

    public static int lcm2(int a,int b){
        int temp;
        if(b<a){
            temp=a;
            a=b;
            b=temp;
        }
        for(int i=b; i<=(a*b); i++){
            if (i % a==0 && i % b ==0){
                return  i;
            }
        }
        return a*b;
    }

    public static double bin2dec(String a){
        // μπορει να χρησιμοποιηθει και σαν βοηθητικη συναρτηση
        double sum=0;
        int length=a.length();
        for(int i=length-1 ; i>=0 ; i--){
            if(a.charAt(i)=='1'){
                sum = sum + Math.pow(2, length - 1 - i);
            }
        }
        return sum;
    }
    public static String maxBinary(String a , String b){
        // 1ος τροπος : μετατρεπουμε τους δυαδικους σε δεκαδικους
        // και τους συγκρινουμε. 
        double decA= bin2dec(a);
        double decB = bin2dec(b);
        if(decA>decB){
            return a;
        }
        else if (decB>decA){
            return b;
        }
        else{
            return a;
        }

    }
    public static String maxBinary2(String a, String b){
        // 2ος τροπος : Τσεκαρουμε τα ψηφια ενα προς ενα
        // ιδεα : 010 < 101, επειδη 0 < 1
        // Αυτος ο τροπος λειτουργει μονο αν τα Strings
        // εχουνε το ιδιο μηκος. 
        int length=a.length();
        
        for(int i=0 ; i<length ; i++){
            if(a.charAt(i)=='0' && b.charAt(i)=='1'){
                return b;
            }
            else if(a.charAt(i)=='1' && b.charAt(i)=='0'){
                return a;
            }

        }
        return a;
    }






    public static void main(String args[]){
        // int n = 21;
        // int a = 15;
        // System.out.println("mod(" + n + ", " + a + " = " + modulo(n, a));
        // System.out.println("gcd(" + n + ", " + a + " = " + gcd(n, a));
        // System.out.println("lcm(" + n + ", " + a + " = " + lcm(n, a));
        // System.out.println("2^" + a + " = " + powerOf2(a));
        // System.out.println(a + "! = " + factorial(a));
        // System.out.print("fibonacci " + a + " οροι : ");
        // for (int i = 0; i < a; i++){
        //     System.out.print(fib(i) + " ");
        // }
        String bin = "101";
        double decBin = bin2dec(bin);
        System.out.println(decBin);
        
    }

}