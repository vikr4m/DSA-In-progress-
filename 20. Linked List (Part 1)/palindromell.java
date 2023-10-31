public class palindromell {
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
        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
        return;
    }

    public Node findmid(Node head){     //Slow - Fast approach (helper function)
        Node slow = head;
        Node fast = head;
        
        while( fast != null && fast.next != null){
            slow = slow.next;   //+1
            fast = fast.next.next;      //+2
        }

        return slow;    //slow is my mid mode
    }

    public boolean palindrome(){
        if(head == null || head.next == null){
            return true;
        }
        
        //step 1 find mid
        Node midnode = findmid(head);

        //step 2 reverse 2nd half
        Node prev = null;
        Node curr = midnode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;   //right half head
        Node left = head;       //left half head

        //step 3 check left & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
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

    public static void main(String[] args) {
        palindromell ll = new palindromell();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(1);
        System.out.println(ll.palindrome()); 
    }
}
