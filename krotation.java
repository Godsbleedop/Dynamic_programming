/* Queue of N integers and an Integer K your task is to rotate the queue k times to the left meaning the first k elements should be moved to back of queue 
in the same order 
1* in > 1 2 3 4 5 
k =2
output 3 , 4 ,5 ,1, 2
  */
import java.util.*;
class rotate {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);

        System.out.println(q);

        int k =2;
        int i=0;
        int ele;

        while(i<k){
            ele = q.remove();
            i++;
            q.add(ele);

        }
        System.out.println(" the rotated queue is "+q);
    }
    
}

