import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		String s = "Hello World! 3 + 3.0 = 6 ";

	      // create a new scanner with the specified String Object
	      Scanner scanner = new Scanner(s);
	      try {
	    	  while (scanner.hasNext()) {
	 	         
	 	         // check if the scanner's next token is an int
	 	         System.out.print ("" + scanner.hasNextInt()+" ");

	 	         // print what is scanned
	 	         System.out.println("" + scanner.next());
	 	      }

	      }finally {
	    	// close the scanner
		      scanner.close();
	      }

	      
	      
	   }

	

}
