package col6;

import java.util.*;

class QueueInterface {
    
     
    public static void main(String args[])
    {
       
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
  
       
        pQueue.add(100);
        pQueue.add(500);
        pQueue.add(1000);
  
        
        System.out.println(pQueue.peek());
  
        
        System.out.println(pQueue.poll());
  
        
        System.out.println(pQueue.peek());
    }
}