import java.util.Stack;
public class StackB {

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushInBottom(s, top);   

    }

    public static void pushInBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushInBottom(s,data);
        s.push(top);

    }

    public static StringBuilder reverseString(String str){
        Stack<Character> c = new Stack<>();


        int idx = 0;
        while(idx<str.length()){
            char curr = str.charAt(idx);
            c.push(curr);
            idx++;
        }
        StringBuilder newStr = new StringBuilder();
        while(!c.isEmpty()){
            char curr = c.pop();
            newStr.append(curr);
        }

        return newStr;
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String str = "abc";
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(reverseString(str));
        
        
    }
}
