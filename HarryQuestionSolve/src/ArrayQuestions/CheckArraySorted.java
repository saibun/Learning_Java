package ArrayQuestions;

public class CheckArraySorted {

	public static void main(String[] args) {
		int[] arr = {7,8,-9,10};
		boolean isSorted= true;
		for(int i = 0; i<arr.length-1;i++) {
			//loop will be continuing arr.length-1 times bcz there will be no element after the last with whom it can compare.
			if(arr[i]>arr[i+1]) {
				isSorted=false;
			}
		}
		if(isSorted) {
			System.out.println("Array is sorted");
		}else{
			System.out.println("Not sorted");
		}

	}

}
