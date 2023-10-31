import java.util.ArrayList;
public class waterfilling{
    // public static int storewater(ArrayList<Integer> height){
    //     int maxwater = 0;
    //     //brute force - O(n^2)
    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = 1; j < height.size(); j++) {
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int wid = j-i;
    //             int currwater = ht*wid; 
    //             maxwater = Math.max(maxwater, currwater);
    //         }
    //     }

    //     return maxwater;
    // }

    // 2 pointer approach O(n)
    public static int storewater(ArrayList<Integer> height){
        int maxwater = 0;
        int leftp = 0;
        int rightp = height.size()-1;

        while(leftp < rightp){
            int wid = rightp - leftp;
            int ht = Math.min(height.get(rightp), height.get(leftp));
            int currwater = ht*wid;
            maxwater = Math.max(maxwater, currwater);

            if(height.get(leftp) < height.get(rightp)){
                leftp++;
            }

            else{
                rightp--;
            }
        }

        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
}