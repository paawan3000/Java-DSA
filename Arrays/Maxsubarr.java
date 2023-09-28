public class Maxsubarr {
    public static void maxSum(int arr[]){
        int currMax = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                currMax = 0;
                for(int k=i;k<=j;k++){
                   currMax = currMax + arr[k];

                   
                }
                System.out.println(currMax);
                
                if(currMax>maxi){
                    maxi = currMax;
                   }
              
            }
        }
        System.out.println("max sum = " + maxi);
    }
    public static void main(String[] args) {

    int arr[] = {2 , 4, 4,2,21};

    maxSum(arr);


    }
    
}
