import java.util.*;
public class prime {
    public static boolean isprime(int n){
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}
