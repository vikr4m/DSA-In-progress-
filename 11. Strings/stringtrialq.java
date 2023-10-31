public class stringtrialq {
    public static void main(String[] args) {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1)+" "+str.equals(str2)); //output-> false true

        String str3 = "ApnaCollege".replace("1", "");
        System.out.println(str3);       //output-> ApnaCollege
    }
}
