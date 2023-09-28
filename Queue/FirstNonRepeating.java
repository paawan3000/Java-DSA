import java.util.*;
import java.util.LinkedList;
public class FirstNonRepeating {
     
    public static void FirstNonRepeatingChar(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>(); 

        for(int i=0;i<str.length();i++){
            char currCh = str.charAt(i);
            q.add(currCh);
            freq[currCh-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
              System.out.print( q.peek()+" ");
            }
        } System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabcccxbdvxxvbbsdfaadgdg";
        FirstNonRepeatingChar(str);
    }
}
