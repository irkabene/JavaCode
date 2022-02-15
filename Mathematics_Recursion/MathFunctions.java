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
            // 1o Σκελος
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
    public static void main(String args[]){
        int n = 21;
        int a = 15;
        System.out.println("mod(" + n + ", " + a + " = " + modulo(n, a));
        System.out.println("gcd(" + n + ", " + a + " = " + gcd(n, a));
        System.out.println("lcm(" + n + ", " + a + " = " + lcm(n, a));
        System.out.println("2^" + a + " = " + powerOf2(a));
        System.out.println(a + "! = " + factorial(a));
        System.out.print("fibonacci " + a + " οροι : ");
        for (int i = 0; i < a; i++){
            System.out.print(fib(i) + " ");
        }
        
    }

}