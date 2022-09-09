
public class Question6 {
	public float add(float[] x) {
		float sum = 0f;
		for (float i : x) {
			sum = sum + i;
		}
		return sum;
	}
 //Create a Array of 5 float and add there sum.
	public static void main(String[] args) {
		float arr[] = {5.4f,3.4f,22.98f,7.67f};
		
		
		float result = new Question6().add(arr);
		System.out.println(result);

	}

}
