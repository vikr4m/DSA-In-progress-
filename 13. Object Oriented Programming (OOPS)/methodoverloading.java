public class methodoverloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float c,float d){
        return c+d;
    }
    public static int sum(int a,int b, int i){
        return a+b+i;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int i = 10;
        float c = 4.0f;
        float d= 5.6f;
        
        System.out.println(sum(a, b));
        System.out.println(sum(c, d));
        System.out.println(sum(a, b, i));
    }
}
