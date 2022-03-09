4package c1;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class ArithmaticCalculator {

	public static void main(String[] args) {
		double num1, num2; // stores two numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		
		num1 = sc.nextDouble(); 
		num2 = sc.nextDouble(); // take the input both
		System.out.println("Enter the arithmatic fuction (+,-,*,/)");
		
		char op = sc.next().charAt(0);
		double o= 0;
		switch (op) {
		
		case '+':
			o = num1 + num2;
			break;      // for addition of two number
			
		case '-':
			o = num1 - num2;
			break;      // for subs of two number 
		case '*':
			o = num1 * num2;
			break;      // for multiplication of two number
		case '/':
			o = num1 / num2;
			break;      // for dived two number
			
		default:
			System.out.println("The input is incorrect");
			break;
			  
		}
		System.out.println("Your answer is = ");
		
		System.out.println();
        
		System.out.println(num1 + " " + " " + op + " " + num2 + "=" + o);
	}

}
