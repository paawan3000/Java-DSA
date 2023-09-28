public class CycleLinkedList {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public static void removeCycle(){

        // Detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;

             if(slow == fast){
                cycle = true;
                break;
             }
        }

        if(cycle==false){
             
            return ;
        }
       
       
        //Finding meeting point 
        slow = head;
        Node prev  = null;

        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        //removing cycle
         prev.next = null;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast !=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true; // Cycle Exists
            }
        }

        return false; // Cycle doesn't Exists
    }

    public static void print() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }
   public static Node head;
    public static void main(String[] args) {

                head = new Node(1);
                Node temp = new Node(2);
                head.next = temp;
                head.next.next = new Node(3);
                head.next.next.next = temp;

                System.out.println(isCycle());
                removeCycle();
                System.out.println(isCycle());
         
                
    }
}
