import java.util.Scanner;
public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch,odd=0,even=0;
        
        do {
          System.out.print("Enter your number: ");
          int n = sc.nextInt();
          if (n%2==0) {
            even+=n;
          }
          else{
            odd+=n;
          }
          System.out.println("press 1 to continue OR any number to exit");
          ch = sc.nextInt();
        } while (ch==1);

        System.out.println("Sum of even: "+even);
        System.out.println("Sum of odd: "+odd);
        sc.close();
    }
}
