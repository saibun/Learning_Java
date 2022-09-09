
public class Question5 {
	/*
	 Decoding and Encoding a grade.
	 */

	public static void main(String[] args) {
		char grade = 'B';
		char de_grade = (char)(grade + 8); //adding a character with an int always will be an integer so we convert that intger into char.
		System.out.println(de_grade);
		char en_grade = (char)(de_grade-8);
		System.out.println(en_grade);
		
				
	}

}
