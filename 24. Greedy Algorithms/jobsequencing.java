import java.util.*;
public class jobsequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

    }
    public static void main(String[] args) {
        int jobsinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsinfo.length; i++) {
            jobs.add(new Job(i, jobsinfo[i][0],jobsinfo[i][1]));
        }

        Collections.sort(jobs, (a,b)-> b.profit-a.profit);  //descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("Max jobs possilbe: "+seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
