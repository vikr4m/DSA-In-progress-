import java.util.Arrays;
public class anagrams {
    public static boolean isanagram(String str, String str1){
        str = str.toLowerCase();            //convert strings to lowercase
        str1 = str1.toLowerCase();

        if (str.length() == str1.length()) {            //check if length of both string matches
            char[] strarray = str.toCharArray();            //convert string  to char array
            char[] str1array = str1.toCharArray();
            Arrays.sort(strarray);                          //sort both char array
            Arrays.sort(str1array);

            if(Arrays.equals(strarray, str1array)){         //check if both sorted arrays are equal
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "earth";
        String str1 = "heart";
        System.out.println(isanagram(str,str1));
    }
}
