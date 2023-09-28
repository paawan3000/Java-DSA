import java.util.*;
public class MinAbsDifference {
    
    public static void main(String[] args) {
        int A[] = {2,4,1};
        int B[] = {1,2,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0;i<A.length;i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Absolute difference is " + minDiff);

    }
}
