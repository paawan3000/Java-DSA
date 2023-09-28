import java.util.*;

public class Activity {

    public static void main(String[] args) {
        int start[] = { 1, 2, 4 , 2, 5, 8, 5 };
        int end[] = { 0, 4, 6, 8 ,7, 9, 9 };

        // not sorted by both end time or start time

        int mat[][] = new int[end.length][3];

        for (int i = 0; i < end.length; i++) {
            mat[i][0] = i;
            mat[i][1] = start[i];
            mat[i][2] = end[i];
        }

        Arrays.sort(mat, Comparator.comparingDouble(o -> o[2]));

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(mat[0][0]);
        int lastEnd = mat[0][2];

        for (int i = 1; i < end.length ; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(mat[i][0]);
                lastEnd = mat[i][2];
                System.out.println(lastEnd);
            }
        }

        System.out.println("Max activity can be performed " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

}
