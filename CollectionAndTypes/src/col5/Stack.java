package col5;

import java.util.*;
 class S {
    
      
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Abc");
        stack.push("Def");
        stack.push("for");
        stack.push("Ijk");
  
      
        Iterator<String> itr = stack.iterator();
  
       
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println();
  
        stack.pop();
  
       
        itr = stack.iterator();
  
        
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
