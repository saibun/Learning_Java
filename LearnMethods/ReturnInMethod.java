package LearnMethods;

public class ReturnInMethod {
	public int m1() {
		int x=10;
		int y=20;
		int z=x+y;
		return z;
	}
	public int m2(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[]args) {
		ReturnInMethod myobj = new ReturnInMethod();
		int result1 = myobj.m1();
		System.out.println("The sum is "+result1);
		int result2=myobj.m2(30,33);
		System.out.println("The biger one is "+result2);
	}

}
