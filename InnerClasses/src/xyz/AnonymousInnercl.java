package xyz;
import java.util.*;


class AIN {

	
	void show()
	{
	
		System.out.println(
			"I am in show method of super class");
	}
}


class Demo {

	
	static AIN d = new AIN() {
		
		void show()
		{
			
			super.show();

			
			System.out.println("I am in Demo class");
		}
	};


	public static void main(String[] args)
	{
		
		d.show();
	}
}

