public class pairarray {
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        int tp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print("("+array[i]+","+array[j]+")"+"\t");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+tp);
    }
}
