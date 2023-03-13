package polymorphism;  //METHOD OVERLOADING EXAMPLE

//OVERLOADING MADHE ARGUMENTS DIFFRENT ASAVE LAGTAT 

public class polymorphisamex1 { 
	
	// 1ST METHOD WITH STRING AND INT ARGUMENT
	
	public void login(String email,int pass)
	{
		System.out.println("nevigate to home page");
	}
	//METHOD OVERLOADING BUT DIFFRENT ARGUMENTS
	// DIFFRENT ARGUMENT AANI TYANCHA SEQUENCE PN VEGLA PAHIJE
	
	public void login(int mobno,int pass)
	{											
		System.out.println("nevigate to home page");
	}
	
	public static void main(String[] args) 
	{
		//CLASS CHA OBJECT CREATE KELA ACEESS SATHI
		
		polymorphisamex1 poly1= new polymorphisamex1(); 
		
		//1st CALL 1ST METHOD
		
		poly1.login("abc@gmail",1234);
		
		//2nd METHOD CALL DIFFRENT ARGUMENT NOT SAME
		poly1.login(12121,12123);
	}
	//IMP 
	//MAIN METHOD PN OVERLOAD KARTA YETE 
	//MAIN METHOD OVERLOAD KARTANI METHOD NAME SAME  YEEL BUT ARGUMENTS BADLTIL
	// COMPILER BY DEFAULT JYACHYA MADHE ARGUMENTS STRING ARRAY ASL TR
	
	public static void main(int a)// main method overload keli
	{
		
		
	}
}
