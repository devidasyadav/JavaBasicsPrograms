package assignment_Programs;

public class Assignment19_ConstructorOverloading 
{
	Assignment19_ConstructorOverloading()
	{
		System.out.println("Constructor non parameter");
	}
	
	 Assignment19_ConstructorOverloading(int a)
	 {
		 System.out.println("Constructor with int parameter");
	 }
	 Assignment19_ConstructorOverloading(boolean flag, double a)
	 {
		 System.out.println("Constructor with multi parameter");
	 }
	 Assignment19_ConstructorOverloading(int a, int b)
	 {
		 System.out.println("Constructor with int parameter");
	 }

	public static void main(String[] args) 
	{
		// WAP to call Constructor Overloading
		// calling parameterized and non parameterized constructor
				// creating object method 1
		Assignment19_ConstructorOverloading ac1= new Assignment19_ConstructorOverloading();
		Assignment19_ConstructorOverloading ac2= new Assignment19_ConstructorOverloading(23);
				// creating object method 2
				//Constructor Overloading
				new Assignment19_ConstructorOverloading();
				new Assignment19_ConstructorOverloading(25);
				new Assignment19_ConstructorOverloading(true, 2.5656);

	}

}
