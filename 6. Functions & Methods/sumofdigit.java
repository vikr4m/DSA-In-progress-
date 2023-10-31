import java.util.*;
public class sumofdigit {

    public static void sumofd(int n){
        int sum =0;
        int mynum = n;
        int rem;
        while (n>0) {
            rem = n%10;
            sum+= rem;
            n = n/10;
        }
        System.out.println("The sum of digit of "+mynum+" is: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sumofd(n);
        sc.close();
    }    
}
