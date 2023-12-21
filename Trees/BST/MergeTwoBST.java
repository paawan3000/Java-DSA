
import java.util.ArrayList;

public class MergeTwoBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }

    }

   public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }
    
    public static Node createBST(ArrayList<Integer> arr,int si,int end){
        while(si>end){
            return null;
        }
        
        
        int mid = (si+end)/2;
        Node root = new Node(arr.get(mid));
      root.left = createBST(arr,si,mid-1);
      root.right = createBST(arr,mid+1,end);
      
      return root;
    }

    public static ArrayList<Integer> mergeTwoBSt(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        getInorder(root1, arr1);
        getInorder(root2, arr2);
        
        int i=0;
        int j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        
        
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        int n = finalArr.size()-1;
    Node root  =  createBST( finalArr , 0 , n);
    preorder(root);
    getInorder(root,ans);
    
    return ans;
    
    }

    public static void preorder(Node root){
        if(root == null ){
            return ;

        }

        System.out.print(root.data + " ");
        preorder(root.left);    
        preorder(root.right);
    }
    public static void main(String[] args) {
        
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        ArrayList<Integer> list = new ArrayList<>();
       list = mergeTwoBSt(root1, root2);


       for(int i=0;i<list.size();i++){
        System.out.print( list.get(i) + " " );
       }


    }
    
}
