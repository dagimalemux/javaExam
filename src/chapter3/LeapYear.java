package chapter3;
import java.util.Scanner;

 class Y{
	 
	double leapCalc(int year){
		
		if((year%4 == 0 && year  != 100)|| (year%400 == 0)) {
			System.out.println("The year "+ year +" is a leap year");
		}
		else {
			System.out.println("The year "+ year +" is not a leap year");
		}
		
		return 0;
	}
}
 
  public class LeapYear {
	
    public static void main(String[] args) {
    	
    Scanner s = new Scanner(System.in);
    
    
    
    System.out.println("Enter year :");
    int year =  s.nextInt();
	
	Y oba = new Y();
	
	System.out.println(oba.leapCalc(year));
	
   }
}