public class invrothalfpyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=n; i++){              //lines
            for(int j = 1; j<=n-i; j++){        //spaces
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){         //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
