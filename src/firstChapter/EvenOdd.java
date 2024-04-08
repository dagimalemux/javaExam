package firstChapter;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("The number you entered "+ number +" is even");
		}
		else if(number%2 != 0){
			System.out.println("The number you entered "+ number +" is Odd");
		}
		
		sc.close();
		
	}
}
