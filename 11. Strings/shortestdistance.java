public class shortestdistance {
    public static float findd(String path){
        int x=0 ,y = 0;
        int n = path.length();
        for (int i = 0; i < n; i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            }
            else if (dir == 'N') {
                y++;
            } 
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(findd(path));
    }
}
