package MetodQuestions;

public class VarArgAverage {
	public static double sum(int ...arr) {
		int store= 0 ;
		for(int k:arr ) {
			 store = store+k;
		}
		double result = (double) store/arr.length;
		return result;
			
	}

	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));

	}

}
