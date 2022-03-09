package cus;


class MyException extends Exception {
	public MyException(String s)
	{
		
		super(s);
	}
}


public class Custom {
	
	public static void main(String args[])
	{
		try {
			
			throw new MyException("JavaWorld");
		}
		catch (MyException ex) {
			System.out.println("Caught");

			
			System.out.println(ex.getMessage());
		}
	}
}

