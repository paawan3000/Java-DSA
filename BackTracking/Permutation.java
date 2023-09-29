public class Permutation {
    public static void main(String[] args) {
        permutationAndComb("abc","");
    }

    public static void permutationAndComb(String str,String ans){
        
        //Base
        if(str.length()==0){
            if(ans.length()==0){
                System.out.println("null");  
                return;   
            }else{
            
                System.out.println(ans);
            return;

            }
        }

        //Recursion
        for(int i = 0;i<str.length();i++){
         char curr  = str.charAt(i);
         String newStr = str.substring(0, i) + str.substring(i+1);
         permutationAndComb(newStr,ans+curr);
        }
 
    }
}
