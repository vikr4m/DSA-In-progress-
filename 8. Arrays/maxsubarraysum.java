public class maxsubarraysum {
    public static void main(String[] args) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int array[] = {1, -2, 6, -1, 3};
        
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                cursum=0;
                for (int k = start; k <= end; k++) {
                    cursum += array[k];
                }
                System.out.println(cursum);
                if (cursum > maxsum) {
                    maxsum = cursum;
                }
                
                
            }
            
        }

        System.out.println("Maximum subarray sum: "+maxsum);
    }
}
