package Interface;

interface Writer{
	void show();
}

class MyPen implements Writer{
	public void show() {
		System.out.println("A pen");
	}
}
class MyPencile implements Writer{
	public void show() {
		System.out.println("A pencile");
	}

}

class MyKit{
	public void refer(Writer p) {
		p.show();
	}
}

public class UnderstandPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyKit myobj = new MyKit();
		Writer myobj1 = new MyPencile();
		
		myobj.refer(myobj1);

	}

}
