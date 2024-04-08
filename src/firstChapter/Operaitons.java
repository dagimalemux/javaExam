package firstChapter;
import java.util.Scanner;
public class Operaitons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = 0;
		System.out.println("Enter your first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter your second number: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the operation you want to perform (+, -, *, /): ");
		String op = sc.next();
		
		if(op.equals("+")) {
			System.out.println("The sum of "+num1+" and " + num2+" is " + (num1 + num2));
		}
		else if(op.equals("-")) {
			
			System.out.println("The  difference between "+num1+" and  " + num2+" is " + (num1 - num2));
		}
		else if(op.equals("/")) {
			
			System.out.println("The devition of "+num1+" and " + num2+" is " + (num1 / num2));
		}
		else if(op.equals("*")) {
			
			System.out.println("The multiplication between "+num1+" and " + num2+" is " + (num1 * num2));
		}
		
	}
}
