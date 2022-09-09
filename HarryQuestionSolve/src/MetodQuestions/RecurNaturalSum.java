package MetodQuestions;
//Adding a certain amount of natural numbers using recursion.
public class RecurNaturalSum {
	public  static int sum(int x) {
		if(x==1) {
			return 1;
		}
		return x + sum(x-1);
	}

	public static void main(String[] args) {
		int result=sum(5);
		System.out.println(result);

	}

}
