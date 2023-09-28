public class AllOccur {
        public static void main(String[] args) {
            int arr[] = {3,2,4,5,6,2,7,2,2};
            // allOcc(arr, 2  , 0);
            int maxi = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                maxi = Math.max(maxi,arr[i]);
            }
            
            System.out.print(maxi);
        }

        public static void allOcc(int arr[],int key,int idx){

            if(idx==arr.length){
                return;
            }
    
            //
            if(  arr[idx]==key){
                System.out.print(idx + " ");
            }

            allOcc(arr, key, idx+1);
           
        }
}
