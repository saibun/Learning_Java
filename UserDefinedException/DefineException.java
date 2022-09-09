package UserDefinedException;

public class DefineException {
	public static void main(String[]args) throws MyException{
		int a = 10;
		if(a!=1) {
			throw new MyException("User created exception");
			
		}
	}

}
