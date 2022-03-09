package reg;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	
	public static void main(String args[])
	{

		
		Pattern pattern = Pattern.compile("j*");

		
		Matcher m = pattern.matcher("java.org");

		
		while (m.find())

			
			System.out.println("Pattern found from "
							+ m.start() + " to "
							+ (m.end() - 1));
	}
}

