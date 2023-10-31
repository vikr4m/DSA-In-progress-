import java.util.*;
public class maxareahistogram {
    public static void maxarea(int heights[]){
        int maxarea =0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        
        //next smaller right
        Stack<Integer> s = new Stack<>();
            for (int i = heights.length-1; i >= 0; i--) {
                while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                    s.pop();
                }

                if(s.isEmpty()){
                    nsr[i] = heights.length;
                }
                else{
                    nsr[i] = s.peek();
                }
                s.push(i);
            }
        
        //next smaller left
        s = new Stack<>();
            for (int i = 0; i < heights.length; i++) {
                while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                    s.pop();
                }

                if(s.isEmpty()){
                    nsl[i] = heights.length;
                }
                else{
                    nsl[i] = s.peek();
                }
                s.push(i);
            }

        //current area  width = j-i-1 = nsr[i]-nsl[i]-1
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i]-nsl[i]-1;
            int currarea = height * width;
            maxarea = Math.max(maxarea, currarea);
        }
        System.out.println("Maximum area in the histogram is: "+maxarea);
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};
        maxarea(heights);
    }
}
