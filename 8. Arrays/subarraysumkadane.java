//KADANE'S ALGORITHM (Best case for subarray sum)

public class subarraysumkadane {
    public static void kadanesubarraysum(int array[]){
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            cursum += array[i];
            if(cursum <0){
                cursum=0;
            }

            maxsum = Math.max(maxsum, cursum);
        }

        System.out.println("Maximum subarray sum: "+maxsum);
    }
    public static void main(String[] args) {
        int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanesubarraysum(array);
    }
}
