public class sumofnrecur {
    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        return n + sumofn(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumofn(n));
    }
}
