package ct1; // Default constructor
import java.io.*;
class A {
	int num;
	String name;
	A(){ System.out.println("Constrctor called");
}
}
public class Cons {

	public static void main(String[] args) {
		A a1= new A();
		System.out.println(a1.name);
		System.out.println(a1.num);

	}

}
