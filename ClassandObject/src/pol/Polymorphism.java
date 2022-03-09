package pol;
class Helper {

	
	static int Multiply(int a, int b)
	{

		
		return a * b;
	}

	
	static double Multiply(double a, double b)
	{

		
		return a * b;
	}
}


class Pol {

	
	public static void main(String[] args)
	{

		System.out.println(Helper.Multiply(5, 9));
		System.out.println(Helper.Multiply(4.3, 8.7));
	}
}

