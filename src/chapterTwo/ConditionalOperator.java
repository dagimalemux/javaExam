package chapterTwo;
import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your score : ");
		double score = sc.nextDouble();
		
		System.out.print(score>=65 ? "Passed" : "Failed");
		}
}
