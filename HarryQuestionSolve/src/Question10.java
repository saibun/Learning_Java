
public class Question10 {

	public static void main(String[] args) {
		int val = 2;
		int result = 0;
		for( int i = 10 ; i>0; i--) {
			System.out.println(val+" * "+ i+"="+val*i);
			int store = val*i;
			result = result + store;
		}
		System.out.println(result);

	}

}
