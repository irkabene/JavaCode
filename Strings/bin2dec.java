public class Bin2DecExercises{

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

    //  2022 Κανονικη Θεμα 2ο
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
        
        String bin = "101";
        double decBin = bin2dec(bin);
        System.out.println(decBin);
    }
}