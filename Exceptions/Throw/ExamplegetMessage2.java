package Exceptions.Throw;

public class ExamplegetMessage2 {

	public static void main(String[] args) {
		String s = "Saikat";
		try {
			int a = Integer.parseInt(s);
			
		}catch(Exception e) {
			System.out.println("exception is "+ e);
		}

	}

}
