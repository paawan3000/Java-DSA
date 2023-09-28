public class Tilling {
    public static int ways(int n){
        if(n==0||n==1){
            return 1;
        }
        int vert = ways(n-1);
        int horz = ways(n-2);
        int finalW = vert + horz;

        return finalW;
    }
    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
