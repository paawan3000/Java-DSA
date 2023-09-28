import java.util.*;
import java.util.LinkedList;
public class DequeB{

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.removeLast();
        

        System.out.println(deque);
    }
}
