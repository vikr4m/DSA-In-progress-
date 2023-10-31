public class checkif2power {
    public static boolean ispower2(int n){
        return ((n & n-1) == 0); 
    }
    public static void main(String[] args) {
        System.out.println(ispower2(15));
    }
}
