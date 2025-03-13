package assignment_Programs;

public class Assignment12_Call3_NonStaticMethods 
{
	void methodA()
	{
		System.out.println("Calling methodA");
	}
	void methodB()
	{
		System.out.println("Calling methodB");
	}
	void methodC()
	{
		System.out.println("Calling methodC");
	}
	
	public static void main(String[] args) 
	{
		Assignment12_Call3_NonStaticMethods obj1= new Assignment12_Call3_NonStaticMethods();
		obj1.methodA();
		obj1.methodB();
		obj1.methodC();
	}
}
