/* a call center has a queue system where  customer calls are handled in FIFO order 
  customer calls they are added to the queue once an agent is free the  next customer is served 
  Q> implement a queue based system to manage customer calls where 
  1* the nexxt call is handled by an available agent 
  2* display the first customer waiting 
  3* a new call is added to queue 
  4* check if the queue is empty */
import java.util.Queue;
import java.util.LinkedList;
class queue2{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("bob");
        q.add("tob");
        q.add("job");
        q.add("nob");
        q.add("nob");
        System.out.println(q);
        System.out.println(" top element is removed "+q.poll());

        System.out.println(" the next customer who is waiting "+q.peek());
        
        
  
      System.out.println("the new customer is added "+q.add(" bob marley"));
             System.out.println(q);
        if(!q.isEmpty()){
            System.out.println("Queue is not empty");
        }
        else{
            System.out.println("Queue is empty");
        }
    
}
}
