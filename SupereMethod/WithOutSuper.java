package SupereMethod;
class A{
	//Constractor
	public A() {
		System.out.println("A Constractor ");
		
	}
	public A(int i) {
		System.out.println("A constractor int");
	}
}

class B extends A{
	public B() {
		System.out.println("B constractor");
	}
	public B(int i) {
		System.out.println("B constractor");
	}
}

public class WithOutSuper {
	public static void main(String[]args) {
		B myobj = new B();
		
				
		
	}

}
