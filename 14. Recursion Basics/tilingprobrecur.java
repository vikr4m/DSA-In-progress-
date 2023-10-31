public class tilingprobrecur {
    public static int tiling(int n){        // 2 * n floor size
        //base case
        if(n==0 || n==1){
            return 1;
        }
        
        // //kaam                           // long way
        // //vertical
        // int vertical = tiling(n-1);
        // //horizontal
        // int horizontal = tiling(n-2);

        // int totways = vertical+horizontal;

        // return totways;

        return tiling(n-1) + tiling(n-2);       //short way
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling(n));
    }
}
