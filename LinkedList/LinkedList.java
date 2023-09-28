public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    public Node midOfLink(Node head){
         Node slow = head;
         Node fast = head.next;
       
        while(fast!=null && fast.next!=null){

                slow = slow.next;
                fast = fast.next.next;
        }

        return slow;
    }

    public boolean palindromeCheck(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid = midOfLink(head);
        
        Node next;
        Node curr = mid; 
        Node prev=null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right!=null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left  = left.next;
        }
        return true;
        }
    

    public int removeNthFromEnd(int n){

    Node temp = head;

    int i = 0;
    int till = size - n;
    
    while(i!= till-1 ){
        temp = temp.next;
        i++;
    }
    int val = temp.next.data;
     temp.next = temp.next.next;

     return val;

    }

    public void reverseLink(){

        Node next;
        Node curr = head;
        Node prev = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;


    }

    public void add(int data,int idx){
        Node newNode = new Node( data);
         size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;   
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print(LinkedList ll) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public int removefirst(){
        if(head==null){
            System.out.println( "Linked list is empty");
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;


    }

    public int searchdata(LinkedList ll,int key){
        Node temp = head;
       
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        
        return -1;
    }

    public void searchdataRec(LinkedList ll,int key,Node temp,int idx){
        
        if(temp == null){
            return ;
        }
  
     if(temp.data == key){
        System.out.println("The Key is present in " + idx);
     }else{
        searchdataRec(ll, key, temp.next, idx+1);
     }

   
    
    }
    
    public int removeLast(){

     if(head==null){
        System.out.println("Linked List is empty");
       return -1;
     }
     else if(size==1){
           int val = head.data;
           head=tail=null;
           size = 0;
           return val;
     }

      int i = 0;
      Node prev = head;

      while(i<size-2){
         prev = prev.next;
         i++;
      }
      size--;
      int val = prev.data;
      prev.next = null;
      tail = prev;

      return val;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
         size++;
        if(head == null){
            head=tail=newNode;
            return;
        }



        tail.next = newNode;
        tail = newNode;
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public Node merge(Node first, Node second){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(first!=null && second!=null){
            if(first.data<=second.data){
                temp.next = first;
                first = first.next;
                temp  = temp.next;
            }else{
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }

        while(first!=null){
            temp.next = first;
            first = first.next;
            temp  = temp.next;
        }

        while(second!=null){
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }



        return mergedLL.next;

    }


    public Node  mergeSort(Node head){
       if(head == null || head.next==null){
        return head;
       }

        Node mid = midOfLink(head);
        Node right = mid.next;
        mid.next = null;
        
       Node leftH =  mergeSort(head);
       Node rightH = mergeSort(right);

       return merge(leftH, rightH);
       
    }

    public  void zigZag(){
        Node mid = midOfLink(head);
        Node curr = mid.next;
        mid.next = null;
        Node next;
        Node prev = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node left = head;
        Node right = prev;
        Node newLeft,newRight;

        while(left!=null && right!=null){

            newLeft = left.next;
            left.next = right;
            newRight = right.next;
            right.next = newLeft;
            left = newLeft;
            right = newRight;

        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        // ll.addfirst(4);
        // ll.addfirst(5);
        // ll.addfirst(6);
        // ll.addLast(89);
        // ll.print(ll);
        // System.out.println(ll.removeNthFromEnd(2));
        // ll.searchdataRec(ll, 89, head, 0);

        // ll.reverseLink();

        // ll.print(ll); 

        // Palindrome check
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(2);
        // ll.addfirst(1);
        // System.out.println(ll.palindromeCheck());

        // ll.addLast(1);
        // ll.addLast(9);
        // ll.addLast(3);
        // ll.addLast(8);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.addLast(7);
        // ll.print(ll);
        // ll.mergeSort(head);
        // ll.print(ll);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print(ll);
        ll.zigZag();
        ll.print(ll);


  

  
    

    }

}
