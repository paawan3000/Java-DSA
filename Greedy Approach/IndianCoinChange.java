import java.util.*;

public class IndianCoinChange {

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int minCount = 0;
        int amount = 70000;
        int intialamount = amount;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    minCount++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println("Min notes required to give " + intialamount + " is " + minCount);

        for(int i=0;i<ans.size();i++){
        System.out.print( ans.get(i) +" ");
        }

    }
}
