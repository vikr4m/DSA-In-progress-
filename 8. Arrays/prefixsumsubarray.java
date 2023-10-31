public class prefixsumsubarray {
    public static void maxsubarraysum(int array[]){
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = 0; j < array.length; j++) {
                int end = j;
                cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }    
        }
        System.out.println("Maximum subarray sum: "+maxsum);
    }
    public static void main(String[] args) {
        int array[] = {1, -2, 6, -1, 3};
        maxsubarraysum(array);
    }
}
