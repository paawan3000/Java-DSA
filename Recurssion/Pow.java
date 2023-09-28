public class Pow {
    public static int powOfx(int x , int n){

        //O(n)
        // if(n==0){
        //     return 1;
        // }
        // return x * powOfx(x, n-1);


        //O(logN)
        if(n==0){
            return 1;
        }
        int psx = powOfx(x,n/2);
        int ans = psx * psx;
        if(n % 2 != 0){
            ans = x * ans;
        }

        return ans;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
       System.out.println( powOfx(x,n));
    }
}
