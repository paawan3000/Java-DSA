public class CountingSort {
            public static void countingSort(int arr[]){
                int maxNumber = Integer.MIN_VALUE;
                
                for(int i = 0 ; i<arr.length;i++){
                    if(arr[i]>maxNumber){
                        maxNumber = arr[i];
                    }
                }
                int countArr[] = new int[maxNumber+1];
                
                for(int i = 0;i<arr.length;i++){
                   
                    countArr[arr[i]]++;
                }

                int j = 0;
                for(int i = 0;i<countArr.length;i++){

                    while(countArr[i]>0){
                        arr[j] = i;   
                        countArr[i]--;
                        j++;

                    }
                }

                for(int i = 0;i<arr.length;i++){
                    System.out.print(arr[i] + " ");
                }


            }
            public static void main(String[] args) {
                int arr[] = { 1,1,4,2,3,3,7};
                countingSort(arr);
            }
}
