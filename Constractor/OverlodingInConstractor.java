package Constractor;

public class OverlodingInConstractor {
	String name;
	int id;
	int roll;
	OverlodingInConstractor(String a){
		name=a;
		System.out.println(name);
		
	}
	OverlodingInConstractor(String a, int b){
		name=a;
		id=b;
		System.out.println(name + id);
	}
	OverlodingInConstractor(String a, int b, int c){
		name=a;
		id=b;
		roll=c;
		System.out.println(a+b+c);
	}
	
	public static void main(String[]args) {
		OverlodingInConstractor myobj = new OverlodingInConstractor("Saikat"), myobj1= new OverlodingInConstractor("Saikat",100);
		OverlodingInConstractor myobj3 = new OverlodingInConstractor("saikat",100,4);
		
		
		
	}
	

}
