import java.util.*;
public class maxlenchainpairs {
    public static void main(String[] args) {    //O(nlogn)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        
        int chainlength = 1;
        int pairend = pairs[0][1];  //last selectec pair end //chain end

        for (int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > pairend){
                chainlength++;
                pairend = pairs[i][1];
            }
        }

        System.out.println("Maximum length of chain possible: "+chainlength);
    }
}
