package LearnMethods;
class StudentDetails{
	int st_id;
	String st_name;
	
	//4
	void stNewEntry(int id,String name) {
		st_id=id;
		st_name=name;
		
	}
	void stDisplay() {
		System.out.println(st_id+" and "+st_name);
	}
	
}



public class StudentIdMethod {
	 //defining fields  
	 int id=10600;//field or data member or instance variable  
	 String name="saikat";  
	 //creating main method inside the Student class  
	 public static void main(String args[]){  
	  //Creating an object or instance 
		 
	 //1
	  //Object and Class Example: main within the class
	  StudentIdMethod s1=new StudentIdMethod();//creating an object of Student  
	  //Printing values of the object
	  System.out.println(s1.id);//accessing member through reference variable  
	  System.out.println(s1.name);
	  
	  
	  
	  
	  //2
	  StudentDetails s2= new StudentDetails();//Object and Class Example: main outside the class
	  s2.st_id=1;
	  System.out.println(s2.st_id);
	  s2.st_name="ram";
	  System.out.println(s2.st_name);
	  
	  //3
	  //creating multiple object
	  StudentDetails s3= new StudentDetails();//Object and Class Example: main outside the class
	  s3.st_id=31;
	  System.out.println(s3.st_id);
	  s3.st_name="3ram";
	  System.out.println(s3.st_name);
	  
	  StudentDetails s4= new StudentDetails();//Object and Class Example: main outside the class
	  s4.st_id=41;
	  System.out.println(s4.st_id);
	  s4.st_name="4ram";
	  System.out.println(s4.st_name);
	  
	  //4
	  //I can use any object between s2-s4 for insert new student entry into method.
	  s4.stNewEntry(23,"sam");
	  s4.stDisplay();
	  
	  //5
	  StudentDetails s6= new StudentDetails(),s7= new StudentDetails();//Creating multiple object in one line
	  
	  
	  
	  
	  
	  
	    
	 }  
}
