package LearnMethods;
class Mybank{
	String name;
	int bank_acc_no;
	double ammount;
	void insert(int n, String a, double x) {
		bank_acc_no=n;
		name=a;
		ammount=x;
	}
	void display() {
		System.out.println("Your account details is "+name+" "+bank_acc_no+" "+ammount);
		
	}
	void deposit(double rupees) {
		ammount=ammount+rupees;
	}
	void withdrawl(double d) {
		if (ammount>d) {
			ammount=ammount-d;
		}else {
			System.out.println("Insufficent balance");
		}
	}
}

public class BankAccount {
	public static void main(String[]args) {
		Mybank saikat = new Mybank();
		saikat.insert(100, "saikat", 1200.50);
		saikat.display();
		saikat.deposit(500);
		saikat.display();
		saikat.withdrawl(200.50);
		saikat.display();
	}
	

}
