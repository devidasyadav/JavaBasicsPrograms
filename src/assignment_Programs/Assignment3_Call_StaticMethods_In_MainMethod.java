package assignment_Programs;

public class Assignment3_Call_StaticMethods_In_MainMethod 
{
	public static void staticAddition() 
	{
		int a=200;
		int b=22;
		int sum=a+b;
		System.out.println("Addition in static method = "+sum);
	}

	public static void staticAddition(int a,int b) 
	{
		int sum=a+b;
		System.out.println("Addition in static method with parameter= "+sum);
	}
	public static void main(String[] args) 
	{
		// Assignment 3: write a program to call static method into main method
		// to call static method in main method we just need to call it by its name
		staticAddition();
		staticAddition(21, 5);

	}
}
