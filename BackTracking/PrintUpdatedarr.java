public class PrintUpdatedarr {
    public static void main(String[] args) {
        int arr[] = new int[5];

        updateprint(arr,0,1);
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void updateprint (int arr[],int i,int val){
        //Base Case
        if(i==arr.length){
            print(arr);
            System.out.println();
            return ;
        }


        //Recursion

        arr[i]= val;
        updateprint( arr, i+1, val+1);
        arr[i] = arr[i] - 2;
        return;
    }
}
