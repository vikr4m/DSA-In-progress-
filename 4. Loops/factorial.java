import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int f = sc.nextInt();
        int fact = 1;
        if (f==0) {
            fact=1;
        }

        while(f>0){
            fact *=f;
            f--;
        }
        System.out.println("Factorial: "+fact);
        sc.close();
    }    
}
