public class solidrhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n-i; space++) {    //spaces
                System.out.print(" ");
            }
            for (int star = 1; star <= n; star++) {    //stars
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
