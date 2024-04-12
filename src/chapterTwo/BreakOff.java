
package chapterTwo;

public class BreakOff {
	public static void main (String[] args) {
		int count;
		
		for(count=1; count<=10; count++) {
			
			if(count == 5) {
				
				continue;
				
			}
			
			System.out.println(count);
		}
		System.out.print("You skipped 5");
	}
	
}
