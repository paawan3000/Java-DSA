import java.util.ArrayList;

public class BSTtoBalanced {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void inorderOfTree(Node root , ArrayList<Integer> inorder){
        if(root == null){
            return ;
        }

        inorderOfTree(root.left, inorder);
        inorder.add(root.data);
        inorderOfTree(root.right, inorder);

    }

    public static Node createBalancedTree( int st, int end,ArrayList<Integer> inorder){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;

      Node root = new Node(inorder.get(mid)) ;
        root.left = createBalancedTree( st, mid-1, inorder);
        root.right = createBalancedTree( mid+1 , end , inorder);

        return root;

    }

    public static Node balancedTree(Node root){
        // Inorder of Tree
        ArrayList<Integer> inorder = new ArrayList<>();

        inorderOfTree(root,inorder);


        // Balanced tree

        root = createBalancedTree(0,inorder.size()-1,inorder);

        return root;
    }

    public static void preorder(Node root) {
        if(root == null ){
            return ;
        }

        System.out.print( root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);


        root = balancedTree(root);
        preorder(root); 
    }
}
