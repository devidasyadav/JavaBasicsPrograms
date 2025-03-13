package assignment_Programs;

public class Assignment18_GlobalVariable 
{

	static int age =33;// static global variable 
	int marks = 78;//Non static global variable
	static void addition()
	{
		int a=22;// local variable within scope of static addition method
		int b= 33;
		int sum = a+b;
		System.out.println("Sum is "+sum);
		System.out.println("Age is "+age);
		//System.out.println("Marks are "+marks); Cannot make a static reference to the non-static field marks
		// we cannot call Non static variable in static method
	
	}
	void subtraction()
	{
		int c=22;// local variable within scope of non static subtraction method
		int d= 33;
		int sub = c-d;
		System.out.println("sub is "+sub);
		System.out.println("Age is "+age);
		System.out.println("Marks are "+marks);
	}
	

	public static void main(String[] args) 
	{
		addition();
		Assignment18_GlobalVariable lv = new Assignment18_GlobalVariable();
		lv.subtraction();
	}
}
