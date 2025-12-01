public class DNA_Searching {

    private static int[] pst (String pattern){ //proper prefix - suffix table
        int prev = 0;
        int i = 1;
        while (i< pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(prev)){
                pst[i] = prev;
                prev = prev +1;
                i = i+1;
            }
            else{
                if (prev == 0){
                    pst[i] = 0;
                    i = i+1;
                }
                else{
                    prev = pst[prev - 1];
                }
            }

        }
        return pst;


    }

    public static boolean dnaSearch( String DNA , String pattern){
        if (pattern.length() == 0){
        return false;
        }
           
        if (DNA.length() < pattern.length()){
            return false;
        }
        int[] pst = pst(pattern);
        int i=0;
        int j=0;
        while (i< DNA.length()){
            if (DNA.charAt(i) == pattern.charAt(j)){
                i = i+1;
                j = j+1;
            }
            if (j == pattern.length()){
                return true;
            }
            else{
                if(j==0){
                    i = i+1;
                }
                else{
                    j= pst[j-1];
                }
            }
           
            
        }
        return false;
    
    }
 
    public static void main(String[] args){
        String DNA = "aaggaaag";
        String pattern = "aaxa";
        boolean answer = dnaSearch(DNA, pattern);
        System.out.println("Answer:" + answer);
    }

    
}
