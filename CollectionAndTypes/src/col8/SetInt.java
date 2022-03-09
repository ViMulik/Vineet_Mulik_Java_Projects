package col8;

import java.util.*;

public class SetInt {
    
      
    public static void main(String args[])
    {
       
        HashSet<String> hs = new HashSet<String>();
  
        
        hs.add("Is");
        hs.add("Java");
        hs.add("Very helpful");
  
       
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
