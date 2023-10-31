import java.util.*;
public class trappingrainwater {
    public static int maxwater(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                int poparr = arr[s.peek()];
                s.pop();

                if(s.isEmpty()){
                    break;
                }
                int distance = i - s.peek()-1;
                int minheight = Math.min(arr[s.peek()], arr[i]) - poparr;

                ans += distance * minheight;
            }
            s.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {7,0,4,2,5,0,6,4,0,5};
        System.out.println(maxwater(arr));
    }
}
