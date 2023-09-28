public class RemoveDup {
    public static void remDup(String str,StringBuilder newStr,int idx,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return ;
        }

        char currChar = str.charAt(idx);

        if(map[currChar-'a'] == true ){
            remDup(str, newStr, idx+1, map);
        }else{
            map[currChar-'a'] = true; 
            newStr.append(currChar);
            remDup(str, newStr, idx+1, map);
         }
    } 
    public static void main(String[] args) {
        String str = "raosahab";
        remDup(str, new StringBuilder(""), 0, new boolean[26]);
    }
}
