
public class Question11 {

	public static void main(String[] args) {
		float[] arr = {5.6f,4.5f,3.8f,2.3f};
		boolean check = false;
		for(float i : arr) {
			if(i == 2.3f) {
				check = true;
				
			}
				
		}
		if(check == true) {
			System.out.println("got the number");
		}else {
			System.out.println("not here");
		}
		System.out.println(arr.length);
		

	}

}
