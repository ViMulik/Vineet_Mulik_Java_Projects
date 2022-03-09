package pil;

// Abstarct class
 abstract class Car {
	public abstract void stop();
}


class Honda extends Car {
	
	@Override public void stop()
	{
		System.out.println("Honda::Stop");
		System.out.println(
			"Mechanism to stop the car using break");
	}
}

 class Main {
	public static void main(String args[])
	{
		Car obj
			= new Honda(); 
		obj.stop(); 
	}
}

