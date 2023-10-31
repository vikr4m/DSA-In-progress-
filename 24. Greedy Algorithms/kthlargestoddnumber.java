//import java.util.*;
// public class kthlargestoddnumber {
//     static int kthlargest(int l, int r, int k){
//         ArrayList<Integer> list = new ArrayList<>();
//         if(k<=0){
//             return 0;
//         }
//         for(int i = r ; i >= l; i--){       //if loop goes from l to r we need to sort descending
//             if(i%2!=0){
//                 list.add(i);
//             }
//         }

//         //Collections.sort(list, Collections.reverseOrder());

//         if(k > list.size()){
//             return 0;
//         }

//         return list.get(k-1);

//     }
//     public static void main(String[] args) {
//         int l = -3;
//         int r = 3;
//         int k = 1;
//         System.out.println(kthlargest(l,r,k));
//     }
// }

//THEIR WAY--------------------------|
public class kthlargestoddnumber {
    public static int kthodd(int[] p, int k){
        if(k <=0){
            return 0;
        }
        int l = p[0];
        int r = p[1];

        if((r & 1) > 0){
            int count =(int) Math.ceil((r-l+1)/2);
        
            if(k > count){
                return 0;
            }
            else{
                return (r - 2 * k + 2);
            }
        }
        else{
            int count = (r - l + 1)/2;

            if(k > count){
                return 0;
            }
            else{
                return (r - 2 * k + 1);
            }
        }

    }
    public static void main(String[] args) {
        int[] p = {-10,10};
        int k = 8;
        System.out.println(kthodd(p,k));
    }
}