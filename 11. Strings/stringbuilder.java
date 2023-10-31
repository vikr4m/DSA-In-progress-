public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }   //abcdefghijklmnopqrstuvwxyz        //O(26)

        System.out.println(sb);
        System.out.println(sb.length());
    }
}
