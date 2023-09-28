public class LinkedLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        public static Node head;
        public static Node tail;
        

        public  boolean isEmpty(){
            return (head==null && tail==null);
        }

        public  void add(int data){
            Node newNode = new Node(data);

            if(head==null && tail==null){
                head=tail=newNode;
                return;
            }

            tail.next = newNode;
            tail= newNode;
        }

        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
        
            if(head==tail){
                int front = head.data;
                head = tail = null;
                return front;
            }

            int front = head.data;
            head = head.next;
            return front;
        }

        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }

            return head.data;
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);   
        q.add(2);   
        q.add(3); 
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
