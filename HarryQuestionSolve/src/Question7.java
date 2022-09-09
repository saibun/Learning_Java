import java.util.Scanner;

public class Question7 {
	//How to check a integer present or not.
	public void search(int x, int[] arr) {
		boolean check = false;
		for(int k : arr) {
			if (x == k) {
				check= true;
				
			}
		}
		if(check == true) {
			System.out.println("Present");
		}else {
			System.out.println("Absent");
		}
	}

	public static void main(String[] args) {
		int [] arr = new int[5];
		arr[0]=1;
		arr[1]=3;
		arr[2]=5;
		arr[3]=0;
		arr[4]=8;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Insert a number to find");
		int inp = scan.nextInt();
		new Question7().search(inp, arr);
		
		scan.close();

	}

}
