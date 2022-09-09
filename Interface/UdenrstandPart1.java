package Interface;
class Pen{
	public void show() {
		System.out.println("A pen");
	}
}
class Pencile{
	public void show() {
		System.out.println("A pencile");
	}

}

class Kit{
	public void refer(Pen p) {
		p.show();
	}
}

public class UdenrstandPart1 {
	public static void main(String[]args) {
		Kit myobj = new Kit();
		Pen myobj1 = new Pen();//TO give input to refer method we have to create a reference of Pen class 
		
		//refer method only take reference of pen class according to it's structure into kit class
		myobj.refer(myobj1);
		
		//It will not take reference of Pencile class
		Pencile myobj2= new Pencile();
		// myobj.refer(myobj2); --> it is showing a error
	}

}
