package lmn;


import java.util.*;


class SNOuter {

	
	private static void outerMethod()
	{

		
		System.out.println("inside outerMethod");
	}

	
	static class Inner {

		public static void display()
		{

			
			System.out.println("inside inner class Method");

			
			outerMethod();
		}
	}
}


class GFG {

	
	public static void main(String args[])
	{

		SNOuter.Inner obj = new SNOuter.Inner();

		
		obj.display();
	}
}

