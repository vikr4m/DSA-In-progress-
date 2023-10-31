import java.util.Scanner;
public class squarearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area = s*s;
        System.out.println("Area: "+area);
        sc.close();
    }    
}
