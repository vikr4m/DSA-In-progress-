public class reverse {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
    

    public void addfirst(int data){
        Node newnode = new Node(data);  //creating a node
        size++;
        if(head==null){
            head = tail = newnode;      
            return;
        }

        newnode.next = head;        //newnode next = head
        head = newnode;             //head = newnode
    }        
        
    public void print(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverselist(){      //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }    
    public static void main(String[] args) {
        reverse ll = new reverse();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.reverselist();
        ll.print();
    }
}
