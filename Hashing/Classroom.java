import java.util.*;
public class Classroom {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> cities = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);
        set.remove(2);
        System.out.println(set.isEmpty());
        System.out.println(set);
        System.out.println(set.contains(2));

        cities.add("Chhindwara");
        cities.add("jabalpur");
        cities.add("Bhopal");
        cities.add("Seoni");
        cities.add("Balaghat");

        Iterator it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());  
        }
        System.out.println();
        for(String city: cities){
            System.out.println(city);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Katni");
        lhs.add("Betul");
        lhs.add("Amla");
        System.out.println(cities);
        System.out.println(lhs);// all operations of hashset can be implementated in lhs and some additional operation to maintain order


        TreeSet<String> ts = new TreeSet<>();

        ts.add("Gangiwada");
        ts.add("Damua");
        ts.add("Parasia");
        ts.add("Narmadapuram");

        System.out.println(ts);



        HashSet<Integer> hset = new HashSet<>();

        int num[] = {4,3,2,5,6,7,3,4,2,1};

        for(int i=0;i<num.length;i++){
            hset.add(num[i]);
        }

        System.out.println("ans = " + hset.size());

    }
}
