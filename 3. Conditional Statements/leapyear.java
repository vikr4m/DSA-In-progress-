import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
    
        String leap = (year%4==0)? "Leap year":"Not a leap year";
        System.out.println(leap);
        sc.close();
    }
}
