public class substring {
    public static String substr(String str, int si, int ei){
        String sstr = "";
        for (int i = si; i < ei; i++) {
            sstr+=str.charAt(i);
            
        }
        return sstr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        //System.out.println(substr(str, 0, 5));
        System.out.println(str.substring(0,5));
    }
}
