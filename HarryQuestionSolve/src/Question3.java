/*
 Check form user input it is int or not.
 */
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			try {
				System.out.print(scan.hasNextInt());
			}finally {
				scan.close();
			}
			
			

	}

}
