import java.util.*;
import java.util.LinkedList;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.getFirst();
        dq.getLast();
    }
}
