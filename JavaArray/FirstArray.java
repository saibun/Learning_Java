package JavaArray;

public class FirstArray {
	public static void main(String[]args) {
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		
		
		int b[]= {
				11,12,13,14
		};//declaration and instantiation and initialization
		//traversing array  
		for(int i=0;i<a.length;i++) {//length is the property of array  
		System.out.println(a[i]);  
		}
		for(int i=0;i<b.length;i++) {//length is the property of array  
			System.out.println(b[i]);  
			}
		/*
		for(int i:a){  
	        System.out.println(a[i]);  
	    }
	     why getting error at this place when code is right??
	    */ 
	}

}
