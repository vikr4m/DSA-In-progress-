/*this is a bigger time complexity way. If u need a shorter approach find permutation of n-1 and m-1
    by ((n-1)+(m-1))! / (n-1)! + (m-1)!
    this will give u number of ways to reach the target cell with linear time complexity that is O(m+n)
    in this case, find all possible ways to arrange D,D,R,R and u will have ur answer*/
public class gridways {
    public static int gridway(int i, int j, int n, int m){
        //base case
        if( i == n-1 && j == m-1){       //for target cell
            return 1;
        }
        else if(i == n || j == m){      //for boundary cell check
            return 0;
        }
        
        int w1 = gridway(i+1,j,n,m);                        
        int w2 = gridway(i,j+1,n,m);

        return w1+w2;

    }
    public static void main(String[] args) {
        int n =3, m=3;
        System.out.println(gridway(0,0,n,m));
    }
}
