public class QuickSort {
    public static void main(String[] args) {
        int arr[]= {3,2,2,1,3,4,4,6};
        quickSort(arr,0     ,arr.length-1);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }


        //kaam
        int pidx = partition(arr,si,ei);

        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);

        

    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i= si-1;

        int j = si;

        while(j<ei){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
                
            }
            j++;
        }
          i++;
         int temp = pivot;
                arr[ei]=arr[i];
                arr[i] = temp;

                return i;

    }
}
