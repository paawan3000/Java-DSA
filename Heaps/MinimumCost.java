import java.util.PriorityQueue;

public class MinimumCost {

    public static void main(String[] args) {
        int ropes[] = {3,2,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost = 0;

        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();

            cost += min + min2;
            pq.add(min + min2);
        }

        System.out.println("The min cost of connecting ropes is " + cost + " and length of rope is " + pq.remove());
    }
}
