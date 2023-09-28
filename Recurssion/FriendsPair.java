public class FriendsPair {
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //Single
        int fsw = friendsPairing(n-1);

        //Pair
        int fpw = friendsPairing(n-2);
        int totWays = fsw + (n-1)*fpw;
          

        return totWays;
        // return friendsPairing(n-1)  + (n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
