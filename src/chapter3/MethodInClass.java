package chapter3;

  class What{
	  int sum;
	  int sumOfNumbers(int...values) {
		  
		  for(int i =0; i<= values.length; i++) {
			  sum+=i;
		  }
		  return sum;
	  }
	  
  }

public class MethodInClass {
	public static void main(String[] args) {
		What obSum = new What();
		
		System.out.println(obSum.sumOfNumbers(1,2,3));
	  
	}
}
