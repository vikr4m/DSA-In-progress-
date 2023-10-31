import java.util.ArrayList;
//for sorted and rotated list
public class pairsum2 {
    public static boolean pairsum(ArrayList<Integer> list, int target){
        int bp =-1;     //breaking point or index where the list is rotated
        for (int i = 0; i < list.size(); i++) {
             if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
             }
        }
        int lp = bp+1;      //left and right pointer for 2 pointer approach
        int rp = bp;

        while( lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(lp+","+rp);
                return true;
            }

            if(list.get(lp) + list.get(rp) > target){
                rp = (list.size() + rp - 1) % list.size();
            }

            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % list.size();
            }
        }

        return false;
        
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        
        System.out.println(pairsum(list,target));

    }
}
