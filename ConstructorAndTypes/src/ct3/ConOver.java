package ct3; // Constructor overloading
import java.io.*;
class C{
	C(String name){
		System.out.println("Constructor with one" + "argument - String : " + name);
	}
	C(String name, int age){
		System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " " + age);
		
	}
	C(long id){
		System.out.println("Constructor with one argument : " + "Long : "+ id);
	}
}
public class ConOver {

	public static void main(String[] args) {
		C c2 = new C("Vaibhav");
		C c3 = new C("Aditya",22);
	    C c4 = new C(12345678); 

	}

}
