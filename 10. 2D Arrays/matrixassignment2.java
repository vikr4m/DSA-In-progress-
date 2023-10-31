public class matrixassignment2 {
    public static void main(String[] args) {
        int sum=0;
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int i=1;
        int j=0;
        while(j < 3){
            sum+=nums[i][j];
            j++;
        }
        System.out.println(sum);
    }
}
