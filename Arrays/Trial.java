public class Trial {

        public static void bubbleSort(int arr[]){

            for(int i = 0;i<arr.length;i++){
                for(int j = i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j] = temp;

                    }
                }
            }
        }

        public static void selectionSort(int arr[]){
             

             for(int i = 0;i<arr.length;i++){
                  int minPos = i;
                  for(int j=i+1;j<arr.length;j++){
                    if(arr[j] < arr[minPos]){
                        minPos = j;
                    }
                  }
                  int temp  = arr[i];
                  arr[i] = arr[minPos];
                  arr[minPos]   = temp;                
             }
        }

        public static void insertionSort(int arr[]){
            
            for(int i = 0;i<arr.length;i++) {
                int curr = arr[i];
                int prev = i-1;
                while(prev>=0 && arr[prev]>curr){
                    arr[prev + 1] = arr[prev];
                    prev--;
                }

                arr[prev + 1]   = curr;

            }
        }

        public static void countingSort(int arr[]){
            int max = Integer.MIN_VALUE;

            for(int i = 0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }

            int count[] = new int[ max + 1] ;

            for(int i = 0;i<arr.length;i++){
                 count[arr[i]]++;
            }

            int j = 0;
            for(int i= 0;i<count.length;i++){

                while(count[i]>0){
                    arr[j] = i;
                    count[i]--;
                    j++;

                }
            }
        }
        public static void print(int arr[]){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]  + " ");
            }
        }
        public static void main(String[] args) {
            int arr[] = { 5,5,2,1,2,4,6,3,3};
            // bubbleSort(arr);    
            // print(arr);
            // selectionSort(arr); 
            // print(arr); 
            // insertionSort(arr); 
            // print(arr);
            countingSort(arr);
            print(arr);

        }
}
