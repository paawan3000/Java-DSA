public class Subsets {
    
    public static void subString(String str,String ans,int i){
        //Base condition
        if(i==str.length()){
             
            System.out.println(ans);
            return;
        }


        //Recursion
        subString(str, ans+str.charAt(i), i+1);
        subString(str, ans, i+1);
    }
        public static void main(String[] args) {
            subString("gfg","",0);
        }
    
}
