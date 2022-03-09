package abc;

class NesOuter {
	 
    
   
    class NesInner {
 
        
        public void show()
        {
 
           
            System.out.println("In a nested class method");
        }
    }
}
 

class Main {
 
   
    public static void main(String[] args)
    {
 
      
        NesOuter.NesInner in = new NesOuter().new NesInner();
 
        
        in.show();
    }
}
