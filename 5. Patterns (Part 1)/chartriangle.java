public class chartriangle {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;

        for (int line = 1; line <= n; line++) {
                for (int chara = 1; chara <= line; chara++) {
                    System.out.print(ch);
                    ch++;                
                }
                System.out.println();
            }
        
    }
}
