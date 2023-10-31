import java.util.*;
public class minimumcurrencyreq {
    public static void main(String[] args) {
        Integer curr[] = {1,2,5,10,20,50,100,200,500,2000};
        
        Arrays.sort(curr, Comparator.reverseOrder());

        int v = 1059;
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < curr.length; i++) {
            if(curr[i] <= v){
                while(curr[i] <= v){
                    count++;
                    ans.add(curr[i]);
                    v-=curr[i];
                }    
            }
        }

        System.out.println("Total currency required:"+count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
