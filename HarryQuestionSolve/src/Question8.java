//Create two matrix of 2*3 and add them.
public class Question8 {

	public static void main(String[] args) {
		int [][] max1 = {{1,2,3},{5,6,7}};
		for ( int k[] : max1) {
			for( int i : k) {
				System.out.print(" "+i);
			}
			System.out.println();
			
		}
		System.out.println("*************************************");
		int [][] max2 = {{11,22,33},{55,66,77}};
		for ( int k[] : max2) {
			for( int i : k) {
				System.out.print(" "+i);
			}
			System.out.println();
			
		}
		System.out.println("*************************************");
		int [][] result= {{0,0,0},{0,0,0}};
		for ( int k[] : result) {
			for( int i : k) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
		System.out.println("*************************************");
		System.out.println("The max length is its row which is " +max1.length);
		System.out.println("*************************************");
		
		
		//adding two matrix
		for( int i = 0;i<max1.length;i++) {
			for(int j = 0 ; j < max1[i].length;j++) {
				result[i][j]= max1[i][j] + max2[i][j];
				System.out.print(result[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
