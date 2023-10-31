import java.util.*;
public class activityselection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};      //end time sorted basis

        int maxact=0;
        ArrayList<Integer> al = new ArrayList<>();

        maxact = 1;
        al.add(0);
        int lastend = end[0];

        for (int i = 0; i < end.length; i++) {
            if(start[i] >= lastend){
                maxact++;
                al.add(i);
                lastend = end[i];
            }
        }
        
        System.out.println("Max activities: "+maxact);
        for (int i = 0; i < al.size(); i++) {
            System.out.print("A"+al.get(i)+" ");
        }
        System.out.println();
    }
}
