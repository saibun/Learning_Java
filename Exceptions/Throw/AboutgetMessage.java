package Exceptions.Throw;

public class AboutgetMessage {

	public static void main(String[] args) {
		try {
			int i = 10/0;
		}catch(Throwable t) {
			System.out.println(t);//by just printing t exception it print the error type with reason of error
			System.out.println(t.getMessage());//By the use of getMessage method we know the reason of the error, not the type name of error
			
		}

	}

}
