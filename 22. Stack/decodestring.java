import java.util.Stack;
public class decodestring {
    public static String decode(String str){
        Stack<Integer> si = new Stack<>();
        Stack<Character> sc = new Stack<>();

        String temp = "" , result ="";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                si.push(count);
            }
            else if(str.charAt(i)==']'){
                temp = "";
                count = 0;

                if(!si.isEmpty()){
                    count = si.peek();
                    si.pop();
                }

                while(!si.isEmpty() && sc.peek()!='['){
                    temp = sc.peek() + temp;
                    sc.pop();
                }

                if(!sc.isEmpty() && sc.peek() == '['){
                    sc.pop();
                }

                for (int j = 0; j < count; j++) {
                    result = result + temp;
                }

                for (int j = 0; j < result.length(); j++) {
                    sc.push(result.charAt(j));
                }
                result="";
            }

            else{
                sc.push(result.charAt(i));
            }
        }

        while(!sc.isEmpty()){
            result = sc.peek() + result;
            sc.pop();
        }

        return result;
    } 
    public static void main(String[] args) {
        String str = "2[cv]";
        System.out.println(decode(str));
    }    
}
