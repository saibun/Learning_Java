import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int [] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for (int i : arr) {
			i = scan.nextInt();
			System.out.println(i+"Insert successfully");
		}

	}

}
