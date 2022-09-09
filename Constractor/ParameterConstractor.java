package Constractor;

public class ParameterConstractor {
	String name;
	int id;
	ParameterConstractor(String a, int b){
		name=a;
		id=b;
	}
	void display() {
		System.out.println("name is "+name+" and id is "+id);
		
	}
	public static void main(String[]args) {
		
		ParameterConstractor myobj = new ParameterConstractor("saikat",100);//constractor usign parameter.
		myobj.display();
	}

}
