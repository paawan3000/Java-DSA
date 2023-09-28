import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        // int n = 4 , m = 6;
        Integer costVer[] = {2,1,3,1,4}; //m-1
        Integer costHor[] = {4 , 1, 2};

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost = 0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += (costHor[h]*vp);
                h++;
                hp++;
            }else{
                cost+= (costVer[v]*hp);
                v++;
                vp++;
            }
        }

        while(h<costHor.length){
                 cost += (costHor[h]*vp);
                h++;
                hp++;
        }

        while(v<costVer.length){
                 cost += (costVer[v]*hp);
                v++;
                vp++;
        }

        System.out.println("Min cost to cut a chocolate in single pieces is " + cost);
    }
}
