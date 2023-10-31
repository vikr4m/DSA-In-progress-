import java.util.Scanner;
public class bitmani {
    public static void oddeven(int n){
        int bitmask =1;
        if ( (n & bitmask) ==1 ){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }

    public static int ithbit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static int setIth(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    
    public static int clearIth(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthbit(int n, int i, int newbit){
        if(newbit == 0){
            return clearIth(n, i);
        }
        else{
            return setIth(n, i);
        }
    }

    public static int clearlastIthbit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask ;
    }
    
    public static int clearinrange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;

        return n & (a|b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddeven(n);
        System.out.println(ithbit(n, 2));
        System.out.println(setIth(n, 2)); 
        System.out.println(clearIth(n, 1));
        System.out.println(updateIthbit(n, 1, 0));
        System.out.println(clearlastIthbit(15, 2));
        System.out.println(clearinrange(10, 2, 4));
        sc.close();
    }
}
