package def;

class MOuter {
	   void outerMethod() {
	      int x = 98;
	      System.out.println("inside outerMethod");
	      class MInner {
	         void innerMethod() {
	            System.out.println("x= "+x);
	         }
	      }
	      MInner y = new MInner();
	      y.innerMethod();
	   }
	}
	class MethodLocalVariableDemo {
	   public static void main(String[] args) {
	      MOuter x=new MOuter();
	      x.outerMethod();
	   }
	}