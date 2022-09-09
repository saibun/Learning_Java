import java.util.Scanner;

/*
 Write a program to calculate marks percentage of 5 subjects.
 */
public class Question1 {

	public static void main(String[] args) {
		System.out.println("Enter yours five subjects number below");
		Scanner scan = new Scanner(System.in);
		try {
			float sub1= scan.nextFloat();
			float sub2 = scan.nextFloat();
			float sub3 =  scan.nextFloat();
			float sub4 =  scan.nextFloat();
			float sub5 =  scan.nextFloat();
			float result = (sub1+sub2+sub3+sub4+sub5)/5;
			System.out.println("The percentage is "+result+" %");
			
		}finally{
			scan.close();
		}

	}

}
