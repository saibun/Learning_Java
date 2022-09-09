package Inheritance;
class New_Cal_Add{
	public int add(int a, int b) {
		return a+b;
	}
}

class New_Cal_Sub extends Cal_Add {
	public int sub(int a, int b) {
		return a-b;
	}
	
}

class Cal_Multi extends Cal_Sub{
	public int multi(int a, int b) {
		return a*b;
	}
}

public class Multilevel_Inheritance {
	public static void main(String[]args) {
		Cal_Multi myobj = new Cal_Multi();
		
		// This is called Multilevel Inheritance
		System.out.println(myobj.multi(10, 4));
		System.out.println(myobj.sub(10, 4));
		System.out.println(myobj.add(10, 4));
	}
	
	

}
