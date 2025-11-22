package Strings;

public class WordInString {
    public static boolean isWordinString(String s , String w){
        int lenS = s.length();
        int lenW = w.length();
        int j = 0;
        if(lenS> lenW){
            for(int i=0 ; i< lenS ; i++){
                if( s.charAt(i)==w.charAt(j)){
                    j=j+1;
                }
                
            }
            if(j==lenW){
                return true;
            }
            else{
                return false;
            }
            
        }
        else{
            return false;
        }
    }
    
}


