public class DoublyLL {
    public static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        size++;
        Node newNode  = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail=newNode;
    }

    public int removeFirst(){
        size--;
        if(head==null){
            System.out.println("Doubly LinkedList is empty");
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
         
        return val;

    }

    public int removeLast(){
        size--;
         if(head==null){
            System.out.println("Doubly LinkedList is empty");
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;


    } 
    public void reverse(){
        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        

        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.print();
        System.out.println( ll.removeFirst());
        System.out.println(ll.removeLast());
        
        ll.print();
        System.out.println(size);

        
        
    }
}
