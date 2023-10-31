public class xpowernrecur {
    public static int xpowern(int x, int n){
        if(n==0){
            return 1;
        }
        return x * xpowern(x, n-1);
    }

    public static int xpown(int x,int n){                          //optimised way with O(log n) time complexity by dividing and adding
        if(n==0){
            return 1;
        }
        int half = xpown(x, n/2);
        int halfpow = half * half;

        //n is odd
        if(n%2!=0){
            halfpow = x * halfpow ;
        }

        return halfpow;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 12;
        //System.out.println(xpowern(x,n));
        System.out.println(xpown(x,n));
    }
}
