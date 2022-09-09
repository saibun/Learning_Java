package MetodQuestions;
//finding fibonacci valu for nth number. (0,1,1,2,3,5,8,13...)

public class FibonacciRecur {
	public int fib(int x) {
		if(x==1 || x==2) {
			return 1;
		}else {
			return fib(x-1)+fib(x-2);
		}
		
	}

	public static void main(String[] args) {
		int result = new FibonacciRecur().fib(5);
		System.out.println(result);

	}

}
