import java.util.ArrayList;
public class monotoniclist {
    // public static boolean monotonic(ArrayList<Integer> nums){
    //     //brute force
    //     for (int i = 0; i < nums.size(); i++) {
    //         for (int j = i+1; j < nums.size(); j++) {
    //             if(nums.get(i) > nums.get(j)){
    //                 return false;
    //             }
    //         }
    //     }

    //     return true;
    // }

    //solution provided
    public static boolean monotonic(ArrayList<Integer> nums){
        boolean inc = true;
        boolean dec = false;

        for(int i = 0; i < nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)){
                inc = false;
            }

            if(nums.get(i) < nums.get(i+1)){
                dec = false;
            }
        }
        return  inc || dec;
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(monotonic(nums));
    }
}
