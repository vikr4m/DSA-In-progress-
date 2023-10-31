public class friendspairingrecur {
    public static int friendpairing(int n){
        if(n == 1 || n ==2){
            return n;
        }

        // //kaam                                   long way
        // //single
        // int fnm1 = friendpairing(n-1);

        // //pair
        // int fnm2 = friendpairing(n-2);
        // int pairways = (n-1) * fnm2;

        // //total ways
        // int totways = fnm1 + pairways;
        // return totways;

        return friendpairing(n-1) + (n-1) * friendpairing(n-2);     //short way 
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendpairing(n));
    }
}
