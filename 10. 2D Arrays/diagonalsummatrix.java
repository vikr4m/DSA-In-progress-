public class diagonalsummatrix {
    public static void diagonalsum(int matrix[][]){
        int sum = 0;
        // for (int i = 0; i <= matrix.length-1; i++) {                    //O(n^2)
        //     for (int j = 0; j <= matrix[0].length-1; j++) {
        //         if (i==j) {
        //             sum+=matrix[i][j];
        //         }

        //         if (i+j == matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println("Diagonal sum: "+sum);

        for (int i = 0; i < matrix.length; i++) {               //O(n)
            //pd
            sum+= matrix[i][i];  
            //sd
            if(i != matrix.length-i-1){
                sum+= matrix[i][matrix.length-i-1];
            }

        }
        System.out.println("Diagonal sum: "+sum);
        
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        diagonalsum(matrix);
    }
}
