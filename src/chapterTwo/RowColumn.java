package chapterTwo;

public class RowColumn {
	public static void main(String[] args) {
		int row = 10;
		while(row >= 1) {
			
		   int coulum = 1;
		   while(coulum <=10) {
			   System.out.print(row%2 == 1 ? "<" : ">");
			   coulum ++;
		   }
			row--;
			System.out.println();
		}
	}

}
