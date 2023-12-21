import java.util.*;
public class ClassroomQue {

    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {9,6,3,4,5,3};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println("Union of arr1 and arr2 = " + set.size() + " " + set);

        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i] + " ");
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection of arr1 and arr2 " + count);

    }
    
}
