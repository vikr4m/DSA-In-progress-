//import java.util.*;
public class balancedstrings {

    static int balanced(String str, int n){
        if(n==0){
            return 0;
        }
        int r=0, l=0;
        int ans=0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='L'){
                l++;
            }

            else if(str.charAt(i)=='R'){
                r++;
            }
            if(r==l){
                ans++;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();
        System.out.println(balanced(str,n)+"\n");
    }
}
