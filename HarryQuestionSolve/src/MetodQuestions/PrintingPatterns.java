package MetodQuestions;

public class PrintingPatterns {
	public void show_pattern() {
		for(int i =0; i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new PrintingPatterns().show_pattern();

	}

}
