import java.util.*;
import java.util.LinkedList;
public class TwoQueues2 {
    //second approach
    static class Stack{

       static Queue<Integer> q1 = new LinkedList<>();
       static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void push(int data){

            q2.add(data);

            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;


        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = q1.remove();
            return top;
        }

        public int peek(){
            if(isEmpty())  {
                System.out.println("Stack is empty");
                return -1;
            }

            return q1.peek();

        }


    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println( s.pop());
            System.out.println(s.peek());
        }
    }
}
