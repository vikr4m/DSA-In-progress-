public class stringlengthrecur {
    public static void strlength(String str, int i){
        if(i==str.length()){
            System.out.print(i);
            return;
        }
        strlength(str, i+1);
    }
    public static void main(String[] args) {
        String str = "Vikram";
        int i=0;
        strlength(str,i);
    }
}
