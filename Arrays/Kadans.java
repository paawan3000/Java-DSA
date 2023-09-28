public class Kadans {
    public static void maxSum(int arr[]) {
        int cs = 0;
        int mx = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            cs+= arr[i];
            if(cs<0){
                cs=0;
            }
            if(mx<cs){
                mx = cs;
            }
        }
        System.out.println("max sum is " + mx);
        
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        maxSum(arr);
    }
   
}
