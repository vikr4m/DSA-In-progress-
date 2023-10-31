import java.util.*;
public class duplicateparentheses {
    public static boolean duplip(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;    //duplicate
                }
                else{
                    s.pop();    //opening pair
                }
            }
            else{
                s.push(ch); //opening
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))";     //true condition since this expression have duplicate parentheses
        String str2 = "(a-b)";       //false condition since this expression does not have duplicate parentheses
        System.out.println(duplip(str1));
        System.out.println(duplip(str2));
    }
}
