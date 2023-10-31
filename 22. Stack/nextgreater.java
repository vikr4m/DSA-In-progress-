import java.util.*;
public class nextgreater {
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,7};
        Stack<Integer> s = new Stack<>();
        int next[] = new int[arr.length];
    
        for (int i = arr.length-1 ; i >= 0; i--) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                next[i] =-1;
            }
            else{
                next[i] = arr[s.peek()];
            }

            //3 push element
            s.push(i);
        }
        for(int i = 0; i < next.length; i++ ){
            System.out.print(next[i]+" ");
        }
    }
}
