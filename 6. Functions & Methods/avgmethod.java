import java.util.Scanner;
public class avgmethod {
    public static void avg(int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("Average is: "+average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three nos for avg: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a,b,c);
        sc.close();
    }    
}
