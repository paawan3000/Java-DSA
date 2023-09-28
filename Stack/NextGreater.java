import java.util.Stack;

public class NextGreater {

    public static void nextGreaterElement(int arr[]) { 
        Stack<Integer> s = new Stack<>();
        int nextGreaterarr[] = new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        int curr = arr[i];
        while(!s.isEmpty() && curr >= arr[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            nextGreaterarr[i] = -1;
        }else{
            nextGreaterarr[i] = arr[s.peek()];
        }
        s.push(i);
    }

    for(int i = 0;i<nextGreaterarr.length;i++){
        System.out.print(nextGreaterarr[i] + " ");
    }
        
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        nextGreaterElement(arr);
    }
}
