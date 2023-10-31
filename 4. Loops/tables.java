import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = " +(i*n));
        }
        sc.close();
    }    
}
