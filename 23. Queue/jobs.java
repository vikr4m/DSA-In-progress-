import java.util.*;                     //NOT WORKING
import java.util.Collections;

public class jobs {
    static class Job{
        char jobid;
        int deadline;
        int profit;

        Job(char jobid, int deadline, int profit){
            this.deadline = deadline;
            this.profit = profit;
            this.jobid = jobid;
        }
    }

    static void jobscheduling(ArrayList<Job> arr){
        int n = arr.size();
        Collections.sort(arr, (a,b)->{return a.deadline - b.deadline;});
        ArrayList<Job> result = new ArrayList<>();
        PriorityQueue<Job> maxheap = new PriorityQueue<>((a,b)->{return b.profit - a.profit;});

        for (int i = n-1; i > -1; i++) {
            int slotavailable;
            if(i==0){
                slotavailable = arr.get(i).deadline;
            }
            else{
                slotavailable = arr.get(i).deadline - arr.get(i-1).deadline;
            }

            maxheap.add(arr.get(i));
            while(slotavailable > 0 && maxheap.size() > 0){
                Job job = maxheap.remove();
                slotavailable--;
                result.add(job);
            }
        }

        Collections.sort(result,(a,b)->{return a.deadline - b.deadline;});

        for(Job job : result){
            System.out.print(job.jobid+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a',2 , 100));
        arr.add(new Job('b',1 , 19));
        arr.add(new Job('c',2 , 27));
        arr.add(new Job('d',1 , 25));
        arr.add(new Job('e',3 , 15));
        jobscheduling(arr);
    }
}
