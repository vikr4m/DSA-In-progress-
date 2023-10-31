public class findsubsets {
    public static void subsets(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }    
            return;
        }

        //Recursion (kaam)

        //yes choice
        subsets(str,ans+str.charAt(i),i+1);

        //no choice
        subsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "",0);
    }
}
