public class incrnumrecur {
    public static void incre(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 25;
        incre(n);
    }
}
