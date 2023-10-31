//push or add with O(n) and pop or remove and peek with O(1)
import java.util.Stack;
public class qusing2stacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();    
        static Stack<Integer> s2 = new Stack<>();

        public boolean isempty(){
            return s1.isEmpty();
        }

        //add - O(n)
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove
        public int remove(){
            if(isempty()){
                System.out.println("Empty queue");
                return -1;
            }
            
            return s1.pop();
        }

        //peek
        public int peek(){
            if(isempty()){
                System.out.println("Empty queue");
                return -1;
            }
            
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
