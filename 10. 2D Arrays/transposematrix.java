import java.util.Scanner;
public class transposematrix {
        public static void printmatrix(int matrix[][]){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int row = 2, column =3;

            int matrix[][] = new int[row][column];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Original Matrix");
            printmatrix(matrix);

            int transpose[][] = new int[column][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Transpose Matrix");
            printmatrix(transpose);
            sc.close();
    }
}
