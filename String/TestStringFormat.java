package String;

public class TestStringFormat {
	public static void main(String[]args) {
		  
		String sf1=String.format("name is %s","Saikat");  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
		  
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3); 
	}
	
	

}
