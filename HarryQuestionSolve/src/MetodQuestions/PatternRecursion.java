package MetodQuestions;
/*
 designing below pattern using recursion method
 * * * *
 * * *
 * *
 * 
 */

public class PatternRecursion {
	public static void pattern(int x) {
		if(x>0) {
			for(int i=0; i<x;i++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		pattern(x-1);
	}

	public static void main(String[] args) {
		pattern(4);
		

	}

}
