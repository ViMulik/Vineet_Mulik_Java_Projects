package ct2; // Parameterized Constructor
import java.io.*;
class B{
	String name;
	int id;
	B(String name, int id) {
		this.name = name;
		this.id = id;
	}
}
public class ConPar {

	public static void main(String[] args) {
		B b1 = new B("Harry",1);
		System.out.println("B Name :"+b1.name +" and B id :"+b1.id);

	}

}
