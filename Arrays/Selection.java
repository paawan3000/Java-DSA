public class Selection {

        public static void selection( int arr[]){
            int n = arr.length;
            for(int i = 0;i<n-1;i++){
                int minPos = i;
                for(int j = i+1;j<n;j++){
                    if(arr[minPos]>arr[j]){
                        minPos = j;
                    }

                }

                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }

        public static void print(int arr[]){
            int n = arr.length;
            for(int i = 0;i<n;i++){
                System.out.print( arr[i] + " ");
            }
        }
        public static void main(String[] args) {
            int arr[] = { 5,3,2,1,4};
            selection(arr);
            print(arr);

        }
}
