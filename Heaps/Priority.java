import java.util.PriorityQueue;
class Priority{

    static class Student implements Comparable<Student> { //overriding

        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("Paawan", 1));
        pq.add(new Student("Himanshi", 34));
        pq.add(new Student("Ayush", 5));
        pq.add(new Student("Ritik", 10));

        while(!pq.isEmpty()){
            System.out.println( pq.peek().name + " -> "+ pq.peek().rank);
            pq.remove();
        }
    }
}