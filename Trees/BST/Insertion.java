import javax.swing.RootPaneContainer;

public class Insertion {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }


        if(value < root.data){
            root.left = insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }
        

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static boolean search(Node root , int key){ // O(H)
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }else if(root.data > key){
            return search(root.left, key);
        }else{
           return search(root.right, key);
        }
    }

    public static Node findInorderSuccesor(Node root , int val){
        while(root.left!=null){
            root = root.left;
        }

        return root;
    }
    

    public static Node delete(Node root , int val){

        if(root.data>val){
           root.left = delete(root.left, val);
        }else if( root.data<val){
           root.right = delete(root.right, val);
        }else{
            // Node is no child
            if(root.left == null && root.right == null){
                return null;
            }

            // Node has one child

            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            // Node has Two child

            Node IS = findInorderSuccesor(root.right,val);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
            
        }

        return root;
    }

    



    public static void main(String[] args) {
        int values[] = {5,1,2,3,8,9,10,4,6,7};

        Node root = null;

        for(int i=0;i<values.length;i++){
          root = insert(root, values[i]);
        }

        inorder(root); 
        System.out.println(); 
       System.out.println( search(root, 12));
        delete(root, 5);
        inorder(root);
    }
}
