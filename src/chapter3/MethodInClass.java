package chapter3;

class Ab{
	int sum;
	
	int theSum(int...values) {
		
		for(int i = 0; i<=values.length;i++) {
			sum+=i;
		}
		
		return sum;
	}
}

public class MethodInClass {
	public static void main(String[] args){
		
		Ab oba = new Ab();
		System.out.println(oba.theSum(1,2,3,4));
		
	}
}


