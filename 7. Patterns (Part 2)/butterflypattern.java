public class butterflypattern {
    public static void main(String[] args) {
        int n = 4;
        //upper half
        for (int i = 1; i <= n; i++) { // lines
            for( int star = 1; star <= i; star++){  //star
                System.out.print("*");
            } 

            for (int space = 1; space <= 2*(n-i); space++){
                System.out.print(" ");
            }

            for( int star = 1; star <= i; star++){  //star
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            for( int star = 1; star <= i; star++){  //star
                System.out.print("*");
            } 

            for (int space = 1; space <= 2*(n-i); space++){
                System.out.print(" ");
            }

            for( int star = 1; star <= i; star++){  //star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
