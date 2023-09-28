


public class FirstandLastocc {
    
    public static int firstOcc(int arr[],int key,int i){
    
    if(i==arr.length){
        return -1;
    }
    
    if(arr[i]==key){
        return i;
    }
    
    return firstOcc(arr,key,i+1);
    
    }

    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }

        return isFound;

    }
    
    public static void main(String[] args) {
        int arr[] ={3,33,99,3,9};
        int key = 2;
       System.out.println( firstOcc(arr,key,0));
       System.out.println( lastOcc(arr,key,0));    
    }
        

}