package firstChapter;
import java.util.Scanner;

public class Separating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a five digit number :");
		int num = sc.nextInt();
		
		if(num < 10000 || num > 99999) {
			System.out.println("Please enter a 5 digit number.");
		}
		
		else {
			String digit = String.valueOf(num);
			
			for( int i=0; i < digit.length(); i++) {
				System.out.print(digit.charAt(i)+"        ");
			}
		}
		sc.close();
		
	}

}
