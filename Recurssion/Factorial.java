
public class Factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fp = fact(n-1);
        int factorial = n * fp;
        return factorial;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(fact(n));
    }
    
}
