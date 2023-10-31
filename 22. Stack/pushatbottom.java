import java.util.*;
public class pushatbottom {
    public static void pushatbot(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushatbot(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatbot(s,4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
