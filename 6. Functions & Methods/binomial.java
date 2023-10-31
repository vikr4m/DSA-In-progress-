import java.util.Scanner;
public class binomial {
    public static int fact(int f){
        int fact = 1;
        while (f>0) {
            fact*=f;
            f--;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r){
        int fn = fact(n);
        int fr = fact(r);
        
        int deno = fr * (fact(n-r));
        int bc = fn/deno;
        return bc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nCr for binomial coefficient\n");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int answer = binomialCoefficient(n, r);
        System.out.print("Binomial coefficient of "+n+"C"+r+": "+answer);

        sc.close();
    }
}
