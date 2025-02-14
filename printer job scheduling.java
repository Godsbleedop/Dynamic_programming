// a printer queue manages print jobs from multiple users the printer process jobs one by one
// new job are added to the queue and the printer dequeus job when completed 
/* implement a print queue that 
1* adds print job to the queues
2* processes and removes the next job
3* display the current job be printed 
4* checks if print queue is empty 
*/
import java.util.Queue;
import java.util.LinkedList;
class queue{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("bob");
        q.add("tob");
        q.add("job");
        q.add("nob");
        q.add("nob");
        System.out.println(q);
        System.out.println(" top element is removed "+q.poll());

        System.out.println(" the next element "+q.peek());
        System.out.println(q.size());
        
  
     

        if(!q.isEmpty()){
            System.out.println("Queue is not empty");
        }
        else{
            System.out.println("Queue is empty");
        }
    
}
}
