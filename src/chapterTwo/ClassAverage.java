package chapterTwo;
import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			
	       
		System.out.println("How many grades do you want to calculate : ");
		int num = sc.nextInt();
		int grade = 0;
		int result = 0;
		int i=1;
		
		while(i <= num) {
			System.out.println("Enter grade : ");
		    grade = sc.nextInt();
		    result+=grade;
		    i++;
		}
		System.out.println("your result is : " + result);
		
		sc.close();
	}
	
	
}
