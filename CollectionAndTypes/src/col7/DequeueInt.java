package col7;

import java.util.*;
public class DequeueInt {
    public static void main(String[] args)
    {
       
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
  
       
        de_que.add(100);
        de_que.add(500);
        de_que.add(1000);
        de_que.add(1500);
        de_que.add(2000);
  
        System.out.println(de_que);
  
      
        de_que.clear();
  
       
        de_que.addFirst(50);
        de_que.addFirst(20);
  
        
        de_que.addLast(30);
        de_que.addLast(10);
  
        System.out.println(de_que);
    }
}
