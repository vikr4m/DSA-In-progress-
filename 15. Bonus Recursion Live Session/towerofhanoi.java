public class towerofhanoi {
    public static void toh(int n, char src, char des, char help){
        //base case
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+des);
            return;
        }

        toh(n-1,src,help,des); //step-1 Transfer n-1 disks from src to help
        System.out.println("Move disk "+n+" from "+src+" to "+des); //step-2 move nth disk from src to des
        toh(n-1,help,des,src);  //step-3 Transfer n-1 disks from help to des
    }
    public static void main(String[] args) {
        int n = 3;
        char src = 'A';
        char des = 'C';
        char help = 'B';
        toh(n,src,des,help);

    }
}
