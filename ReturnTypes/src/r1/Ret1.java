package r1;
import java.util.*;
import java.util.Scanner;

class Circle {
 double radius;
 double area() {
	 double r= 4;
	 double ar = 3.14 * r * r;
	 return ar;
 }
 }
 public class Ret1{
	 
	public static void main(String[] args) {
		Circle c = new Circle();
		double area;
		area = c.area();
		System.out.println("Area of a Circle is = "+ area);

	}
}
