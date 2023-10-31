public class subarray {
    public static void printSubarray(int array[]){
        int ts=0;
        int sum= 0;
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for(int k= start; k<=end; k++){
                    System.out.print(array[k]+" ");
                    sum+=array[k];
                }
                ts++;
                System.out.println();
                System.out.println("Sum of sub array: "+sum);

                if(sum > large){
                    large = sum;
                }
                if(sum < small){
                    small = sum;
                }
                sum=0;
                System.out.println();
                
            }
            System.out.println();
        }

        System.out.println("Total sub arrays: "+ts);
        System.out.println("Largest sum of sub arrays: "+large);
        System.out.println("Smallest sum of sub arrays: "+small);
    }
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        printSubarray(array);
    }
}
