import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class notsortedactivity {
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8};    
        int end[] = {6,2,4,8,9,9};      

        //sorting
        int activities[][] = new int[end.length][3];
        for (int i = 0; i < end.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); //sorted on end time basis ie column 2 in activities

        int maxact = 0;
        ArrayList<Integer> al = new ArrayList<>();

        maxact = 1;
        al.add(activities[0][0]);
        int lastend = activities[0][2];
        for (int i = 0; i < end.length; i++) {
            if(activities[i][1] >= lastend){
                maxact++;
                al.add(activities[i][0]);
                lastend =activities[i][2];
            }
        }

        System.out.println("Max activites: "+maxact);
        for (int i = 0; i < al.size(); i++) {
            System.out.print("A"+al.get(i)+" ");
        }
        System.out.println();
    }
}
