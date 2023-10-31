public class LinkedList {
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

    //methods to perform operations on linkedlist
    //1.add first
    public void addfirst(int data){
        //step1 - create new node
        Node newnode  = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }

        //step2 - newnode next = head
        newnode.next = head;

        //step3 - head = newnode
        head = newnode;
    }
    //2.add last
    public void addlast(int data){
        //step1 - create new node
        Node newnode  = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }

        //step2 - tailnode next = new node
        tail.next = newnode;

        //step3 - tail = newnode
        tail = newnode;
    }

    //3. add in the middle
    public void add(int idx, int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        //temp is on idx-1(prev)
        newnode.next = temp.next;
        temp.next = newnode;
    }

    //4. Remove first
    public int removefirst(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if( size ==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        else if( size ==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int search(int key){     //Iterative with O(n) time complexity
        Node temp = head;
        int i =0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1; //key not found
    }

    public int helper(Node head, int key){  //main function for recursive search
        if(head==null){ 
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;   
        }
        return idx+1;

    }
    public int recsearch(int key){  //Recursive search
        return helper(head, key);
    }

    

    public void print(){  //O(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.add(3, 5);
        //ll.removefirst();
        ll.print();
        //ll.removelast();
        //ll.print();
       // System.out.println(ll.size);
       //System.out.println(ll.search(3));
       System.out.println(ll.recsearch(3));

    }
    public LinkedList.Node mergesort(LinkedList.Node head2) {
        return null;
    }
}
