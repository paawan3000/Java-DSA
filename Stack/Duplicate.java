import java.util.Stack;

public class Duplicate {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            //Closing Condition
            if(c==')'){
                int count = 0;
                while(s.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true; //Duplicate Exists
                }
            }
            else{
                s.push(c);
            }

            
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b) + (a+b))";
        System.out.println(isDuplicate(str));
    }
}
