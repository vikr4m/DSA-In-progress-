public class loopqtrial {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 5; i++) {
            System.out.println("i = " +i);          //i is initialised in the for loop so it gives an error if i is used outside the loop
        }
        System.out.println("i after the loop = "+ i);
    }
}
