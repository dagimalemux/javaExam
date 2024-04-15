package chapter3;

public class TheMod {
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i= 1; i<4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k =1; k<3; k++) {
					sum = i + j + k;
					if(sum > i) {
						break;
					}
				}
			}
			
			if(sum%5 == 0) {
				System.out.println(sum);
			}
		}
	}
}
