package assignment_Programs;

public class Assignment13 
{
	static void methodA_Static()
	{
		System.out.println("Calling Static methodA");
	}
	static void methodB_Static()
	{
		System.out.println("Calling Static methodB");
	}
	static void methodC_Static()
	{
		System.out.println("Calling Static methodC");
	}

	 void methodA_Nonstatic()
	{
		System.out.println("Calling Non-Static methodA");
	}
	 void methodB_Nonstatic()
		{
			System.out.println("Calling Non-Static methodB");
		}
	 void methodC_Nonstatic()
		{
			System.out.println("Calling Non-Static methodC");
		}
	public static void main(String[] args) 
	{
		//calling static method by name( no need to create object)
		methodA_Static();
		methodB_Static();
		methodC_Static();
		// calling non static method in main method - need to create object reference
		Assignment13 a1=new Assignment13();
		a1.methodA_Nonstatic();
		a1.methodB_Nonstatic();
		a1.methodC_Nonstatic();
		
	}
}
