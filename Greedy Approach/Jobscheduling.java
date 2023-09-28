import java.util.*;

public class Jobscheduling {
    
     static class Job{
        int deadline;
        int profit;
        int id;

        Job(int i, int p, int d){
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }

     }

    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

            ArrayList<Job> jobs = new ArrayList<>();

            for(int i=0;i<jobInfo.length;i++){
                jobs.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
            }

            Collections.sort(jobs, (obj1,obj2)-> obj2.profit - obj1.profit);
            ArrayList<Integer> result = new ArrayList<>();
            int time = 0;

            for(int i=0;i<jobs.size();i++){
                Job currJob = jobs.get(i);
                if(currJob.deadline > time){
                    result.add(currJob.id);
                    time++;
                }
            }
            
            System.out.println("Maximum number of jobs can be done is "+ result.size());

            for(int i=0;i<result.size();i++){
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
        

    }
}
