package chapterTwo;
import java.util.Scanner;

public class forFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int total=0;
		
		for(int i = 2; i<=num; i+=2) {
			total+=i;
		}
		
		System.out.println("The total of this even numbers is " + total);
	}
}
