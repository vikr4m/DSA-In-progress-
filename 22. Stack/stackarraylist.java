import java.util.ArrayList;
public class stackarraylist {
    static class Stack{
        static ArrayList<Integer> list  = new ArrayList<>();

        public boolean isempty(){
            return list.size() == 0;
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public int pop(){
            if(isempty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public int peek(){
            if(isempty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;                     // OR return list.get(list.size()-1); im place of the two lines
        }
    }
    
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        s.push(6);

        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
