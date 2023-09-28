import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int bitMask = 1;
    
            if ((n & bitMask) == 1) {
                System.out.println("Odd Number");
            } else {
                System.out.println("Even Number");
            }

        }finally{
            sc.close();
        }

    }

}
