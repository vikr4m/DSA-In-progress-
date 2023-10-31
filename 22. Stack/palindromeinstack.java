import java.util.*;
public class palindromeinstack {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static boolean ispalindrome(Node head){
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> s = new Stack<>();

        while(slow != null){
            s.push(slow.data);
            slow = slow.next;
        }

        while(head != null){
            int i = s.pop();
            if(head.data == i){
                ispalin = true;
            }
            else{
                ispalin = false;
                break;
            }
            head = head.next;
        }
        
        return ispalin;

        
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(ispalindrome(one));
        


    }
}
