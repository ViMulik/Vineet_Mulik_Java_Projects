package dia;
interface I1 {

	
	default void show()
	{

		
		System.out.println("Default I1");
	}
}


interface I2 {

	
	default void show()
	{

		
		System.out.println("Default I2");
	}
}


class TestClass implements I1, I2 {

	
	public void show()
	{

		
		I1.super.show();

		
		I2.super.show();
	}

	
	public static void main(String args[])
	{
		TestClass d = new TestClass();
		d.show();
	}
}

