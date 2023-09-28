public class RotatedSorted {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3};
     System.out.println(search(arr,7 ,0, arr.length-1));


    }

    public static int search(int arr[],int target,int si,int ei){

        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(target == arr[mid]){
            return mid;
        }

        //Line number one
        if(arr[si] <= arr[mid]){

            //Case 1 left part

            if( arr[si]<=target  && target <=arr[mid]){
                return search(arr, target, si, mid-1);

            }
            //Case 2 right part
            else{
                 return search(arr, target, mid+1, ei);
            }

        }

        //line two
        //if mid<=arr[si]
        else{
             //right part
            if( arr[mid]<= target && target<=arr[ei]){
                 return search(arr, target, mid, ei);
            }
            

            //left part
            else{
                return search(arr, target, si, mid-1);
            }

        }

    }
}
