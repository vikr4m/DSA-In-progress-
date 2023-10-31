public class numtoword{
    public static void toword(int number){
        String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(number==0){
            return;
        }

        int lastdigit = number%10;
        toword(number/10);
        System.out.print(digits[lastdigit]+" ");
        
    }
    public static void main(String[] args) {
        toword(1947);
    }
}