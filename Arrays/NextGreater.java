public class NextGreater {
    public static void nextGreaterElement(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];

        for(int i = 0;i<n;i++){
                boolean ispresent = false;
                int j = i+1;
            while(j<n){
                if(arr[i]<arr[j]){
                        ispresent = true;
                        ans[i] = arr[j];
                        break;
                }
                j++;
            }
            if(!ispresent){
                ans[i] = -1;
            }
            
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {6,8,0,1,3};
        nextGreaterElement(arr);
    }
}
