package Inheritance;
class Cal_Add{
	public int add(int a, int b) {
		return a+b;
	}
}

class Cal_Sub extends Cal_Add {
	public int sub(int a, int b) {
		return a-b;
	}
	
}

public class Single_Level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal_Sub myobj = new Cal_Sub();
		int result1=myobj.add(100, 50);
		int result2=myobj.sub(20, 9);
		System.out.println(result1);
		System.out.println(result2);
		
		
		//Notice here we create an object of parent class using child class it can only access parent class method
		Cal_Add myobj1 = new Cal_Sub();
		int result3=myobj1.add(100, 40);
		//myobj1.sub(); it will be not working because this object only can fetch parent method
		System.out.println(result3);
		

	}

}
