public class removenthfromlast {
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

    public void addlast(int data){
        Node newnode = new Node(data);
        size++;

        if(head == null){
            head = tail = newnode;
        }

        tail.next = newnode;
        tail = newnode;
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

    public void removenfromend(int n){
        if(n == size){
            head = head.next;   //removes first element
            return;
        }

        //size-n;
        int i = 1;
        int itofind = size-n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }

        prev.next= prev.next.next;
        return;

    }
    public static void main(String[] args) {
        removenthfromlast ll = new removenthfromlast();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.removenfromend(3);
        ll.print();
    }
}
