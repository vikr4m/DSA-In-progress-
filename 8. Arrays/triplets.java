public class triplets {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
                        sum = nums[i] + nums[j] + nums[k]; 
                    }

                    if(sum == 0){
                        System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                    }
                }
            }
        }
    }
}
