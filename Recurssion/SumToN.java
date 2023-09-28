
public class SumToN {
        public static int sum(int n){
            if(n==1){
                return n;
            }

            int fsum =n+ sum(n-1);

            return fsum;
        }
        public static void main(String[] args) {
            int n = 10;
            System.out.println(sum( n));
        }
}
