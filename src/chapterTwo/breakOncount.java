package chapterTwo;

public class breakOncount {
	public static void main(String[] args) {
		int count;
		for(count = 0; count<=10; count++) {
			if(count == 5) {
				break;
			}
			System.out.println(count);
		}
		System.out.println("The system broke on count: " + count);
	}
}
