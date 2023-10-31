import java.util.LinkedList;
public class collectionll {
    public static void main(String[] args) {
        //to create ll
        LinkedList<Integer> ll = new LinkedList<>();

        //to add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);

        //to remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
