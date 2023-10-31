import java.util.*;

public class chocolaproblem {
    public static void main(String[] args) {
        //int n = 4, m = 6;
        Integer costv[] = {2,1,3,1,4}; //m-1;   Vertical cost
        Integer costh[] = {4,1,2};  //n-1;      Horizontal cost

        Arrays.sort(costv, Collections.reverseOrder());
        Arrays.sort(costh, Collections.reverseOrder());

        int h=0, v=0;   //h cuts, v cuts
        int hp=1, vp=1; //count of h pieces and v pieces
        int cost=0;

        while (h < costh.length && v < costv.length) {
            if(costv[v] <= costh[h]){   //horizontal cut
                cost+= (costh[h] * vp);    
                hp++;
                h++;
            }
            else{                       //vertical cut
                cost+= (costv[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costh.length){
            cost+= (costh[h] * vp);    
            hp++;
            h++;
        }

        while (v < costv.length){
            cost+= (costv[v] * hp);    
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cuts: "+cost);
    }
}
