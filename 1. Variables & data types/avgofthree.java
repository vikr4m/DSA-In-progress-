import java.util.Scanner;
public class avgofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float avg = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg = (a+b+c)/3;
        System.out.println("Average: "+avg);
        sc.close();
    }
}
