import java.util.*;
import java.util.LinkedList;
public class Interleave {

    public static void interLeaf(Queue<Integer> q){
        int size = q.size()/2;
        Queue<Integer> first = new LinkedList<>();
        for(int i=0;i<size;i++){
            first.add(q.remove());
        }


        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q  = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int size = q.size();
        for(int i=0;i<size;i++){
            q.add(q.remove());
        }

        
        // interLeaf(q);

        // while(!q.isEmpty()){
        //     System.out.print(q.remove() + " ");
        // }
    }
}
