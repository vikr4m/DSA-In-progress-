import java.util.*;
public class complexnum {
    public static void main(String[] args) {
        int r1,r2,i1,i2;
        Scanner sc = new Scanner(System.in);
        Complex c = new Complex();
        
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        i1 = sc.nextInt();
        i2 = sc.nextInt();

        c.real(r1,r2);
        c.imaginary(i1, i2);
        System.out.println(c.sum());
        System.out.println(c.difference());
        System.out.println(c.product());
        sc.close();
    }
}

class Complex{
    int r1,r2,i1,i2;
    
    void real(int r1,int r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    void imaginary(int i1,int i2){
        this.i1 = i1;
        this.i1 = i2;
    }
    String sum(){
        int a = r1+r2;
        int b = i1+i2;
        return "Sum: "+a+"+"+b+"i";
    }

    String difference(){
        int a = r1-r2;
        int b = i1-i2;
        return "Difference: "+a+"+"+b+"i";
    }

    String product(){
        int a = r1*r2;
        int b = i1*i2;
        return "Product: "+a+"+"+b+"i";
    }
}