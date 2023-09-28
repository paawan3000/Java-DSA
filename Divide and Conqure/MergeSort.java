public class MergeSort {
    public static void main(String[] args) {
        int arr[]= {3,2,3,4,5,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
        
    }   

    public static void mergeArr(int arr[],int start,int mid,int end){
        int temp[]= new int[end-start +1];

        int i = start;
        int j = mid+1;
        int k = 0;


        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;

            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
                temp[k++]=arr[i++];
            }
            while(j<=end){
                temp[k++]=arr[j++];
            }

            for( k=0,i=start;k<temp.length;k++,i++){
                arr[i] = temp[k];

            }
    }
    
    public static void mergeSort(int arr[],int s,int e){
        int si =s;
        int ei = e;
        int mid = si +(ei-si)/2;

        if(si>=ei){
            return;
        }

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        mergeArr(arr,si,mid,ei);


    }

    public static void print(int arr[]){
        for(int i  = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
