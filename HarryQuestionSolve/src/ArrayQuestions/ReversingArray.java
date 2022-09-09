package ArrayQuestions;

public class ReversingArray {

	public static void main(String[] args) {
		int[] arr = { 7,8,9,10};
		int loop_time = arr.length/2;
		
		//we can also use loop_occure at the place of loop_time
		int loop_occure= Math.floorDiv(arr.length, 2);//5/2=2.5 , and it will give greatest value of 2.5 that is 2.
	
		System.out.println(loop_occure);
		
		
		//System.out.println(loop_time);
		for(int i= 0 ; i<=loop_time;i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
			

	}

}
