package Constractor;

public class CopyConstractor {
	String name;
	int id;
	CopyConstractor(String a, int b){
		name=a;
		id=b;
		System.out.println("this is first constractor");
	}
	CopyConstractor(CopyConstractor a){
		name=a.name;
		id=a.id;
		System.out.println("This is copy one");
	}
	public static void main(String[]args) {
		CopyConstractor myobj = new CopyConstractor("Saikat",1);
		CopyConstractor myobj2 = new CopyConstractor(myobj);
	}

}
