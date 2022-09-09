package ArrayQuestions;

public class Max_Array_Element {

	public static void main(String[] args){
		int[] arr = {7,8,-89,10};
		int max=Integer.MIN_VALUE;//it will give the min valu that store by java
		try {
			for(int i : arr) {
				if(i>max) {
					max=i;
				}
			}
			System.out.println(max);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
