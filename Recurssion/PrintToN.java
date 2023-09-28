
public class PrintToN {
    public static void printNumber(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }

        printNumber(n-1);
        System.out.print(n + " ");
    } 
    public static void main(String[] args) {
        int n = 10;
        printNumber(n);
    }

}