import java.util.Scanner;
public class billsystem {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    
    float total = pen + pencil + eraser;

    System.out.println("Total Amount: "+total);
    
    float newtotal = (0.18f*total) + total;

    System.out.println("Total Amount(with taxes): "+newtotal);
    sc.close();
    }
}

