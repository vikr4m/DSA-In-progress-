public class hollowrhombus {
    public static void main(String[] args) {
        int n = 5;
        int space;
        for (int i = 1; i <= n; i++) {
            for ( space = 1; space <= n-i; space++) {    //spaces
                System.out.print(" ");
            }
            for (int star = 1; star <= n; star++) {    //stars
                if (star == 1 || star == n || space == 1 || space == n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
