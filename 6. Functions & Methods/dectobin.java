import java.util.*;
public class dectobin {

    public static void decTobin(int d){
        int pow=0;
        int b=0;
        int rem;
        int mynum = d;
        while (d>0) {
            rem = d%2;
            b = b + (rem * (int)Math.pow(10, pow));
            d = d/2;
            pow++;
        }

        System.out.println("Binary of "+mynum+" is: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in decimal: ");
        int d = sc.nextInt();
        decTobin(d);
        sc.close();
    }    
}
