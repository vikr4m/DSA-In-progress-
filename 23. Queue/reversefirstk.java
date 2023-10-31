import java.util.Deque;         //NOT WORKING
import java.util.LinkedList;
public class reversefirstk {
    public static void reverse(int[] arr, int len, int k){
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
            dq.addLast(i);
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[dq.peek()]+" ");
            while(!dq.isEmpty() && dq.peek() <= i-k)
                dq.removeFirst();
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();
                
            dq.addLast(i);
        }
        System.out.print(dq.peek());
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        int len = arr.length;
        reverse(arr,len,k);
    }
}
