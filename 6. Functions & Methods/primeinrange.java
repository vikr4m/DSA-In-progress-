import java.util.*;
public class primeinrange {
    public static boolean prime(int n){
        if (n==2) {
            return true;
        }
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    
    public static void isprime(int s, int e){
        System.out.print("Prime nos: ");
        for (int i = s; i <=e; i++) {
            if (prime(i) == true) {
                System.out.print(i+" ");
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range for prime:");
        int s = sc.nextInt();
        int e = sc.nextInt();
        isprime(s, e);
        sc.close();
    }
}