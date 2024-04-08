package chapterTwo;

public class ModuloPattern {
	
	    public static void main(String[] args) {
	        int count = 1;
	        
	        while (count <= 10) {
	            System.out.println(count % 2 == 1 ? "****" : "++++++++");
	            ++count;
	        }
	    }
}



