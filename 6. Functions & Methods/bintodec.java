import java.util.*;
public class bintodec {
    public static void binTodec(int b){
        int d=0;
        int pow = 0;
        int ld;
        int mynum = b;
        while (b>0) {
            ld = b%10;
            d = d + (ld * (int)Math.pow(2, pow));
            pow++;
            b = b/10;
        }

        System.out.println("Decimal of "+mynum+" is: "+d);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in binary: ");
        int b = sc.nextInt();
        binTodec(b);
        sc.close();
    }    
}
