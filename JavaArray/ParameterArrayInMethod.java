package JavaArray;

public class ParameterArrayInMethod {
	 void min(int arr[]) {
		 //if i use static keyword
		int mini=arr[0];
		for(int i =1;i<arr.length;i++) {
			if(mini>arr[i]) {
				mini=arr[i];
			}
		}
		System.out.println(mini);
	}
	public static void main(String[]args) {
		int arr[]= {
				33,4,21
		};
		ParameterArrayInMethod myobj = new ParameterArrayInMethod();
		myobj.min(arr);
		//i will write just min(arr) at static case.
	
	}

}
