public class diamond {
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n-i; space++) {    //space
                System.out.print(" ");
            }
            for (int star = 1; star <= (2*i)-1; star++) {    //star
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= n-i; space++) {    //space
                System.out.print(" ");
            }
            for (int star = 1; star <= (2*i)-1; star++) {    //star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
