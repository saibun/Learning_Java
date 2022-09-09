package MetodQuestions;

public class Multiplication_table {
	public static int multi_tbl(int num) {
		int result = 1;
		while(num>0) {
			result = num*result;
			num=num-1;
		}
		return result;
		
	}

	public static void main(String[] args) {
		int result=multi_tbl(5);
		//If we not used static keyword at multi_tbl then we have to call constractor of this class.That case it will be like this
		//int result = new Multiplication_table().multi_tbl(int num);
		System.out.println(result);

	}

}
