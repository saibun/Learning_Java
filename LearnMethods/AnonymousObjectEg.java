package LearnMethods;

public class AnonymousObjectEg {
	//making a factorial program using anonymous object
	void fact(int num) {
		int fact_num=num;
		int result=1;
		while(fact_num!=0) {
			result=fact_num*result;
			fact_num-=1;
		}
		System.out.println("factorial is "+result);
	}
	public static void main(String[]args) {
		new AnonymousObjectEg().fact(5);//using anonymous object "new classname.method(input)"
	}

}
