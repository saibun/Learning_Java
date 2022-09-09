/*
 *What will be the result of the following expression 
 *float a = 7/4*9/2.
 */
public class Question4 {

	public static void main(String[] args) {
		float a = 7/4.0f * 9/2.0f;
		System.out.println(a);
		/*
		 * if we did just 7/4 * 9/2
		 *  the first 7/4 will be 1.75 but it will take 1 only ( only take integer portion).
		 *  then 1* 9 = 9 and the 9/2 = 4.5 but it will take 4 only and answer will be 4 only.
		 *  For better understand it is printing below
		 */
		float b = 7/4.0f * 9/2.0f;
		System.out.println(b);

	}

}
