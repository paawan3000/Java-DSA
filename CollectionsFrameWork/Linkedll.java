import java.util.LinkedList;
public class Linkedll {

   
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(); 
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        System.out.println(ll);
        System.out.println();
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
        for(Integer element:ll){
            System.out.print(element);
        }

    }
}
