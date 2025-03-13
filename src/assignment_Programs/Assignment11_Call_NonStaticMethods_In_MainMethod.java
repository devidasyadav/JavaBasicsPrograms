package assignment_Programs;

public class Assignment11_Call_NonStaticMethods_In_MainMethod 
{
	public void Subtraction() 
	{
		double a=14.545413111;
		double b=2.644644;
		double sub=a-b;
		System.out.println("Subtraction in Non-static method = "+sub);
	}

	public void Multiplication(int a,int b) 
	{
		int multi=a*b;
		System.out.println("Multiplication in Non-static method with parameter= "+multi);
	}

	public static void main(String[] args) {
		// Assignment 4: write a program to call Non static method into main method
		// to call non static method into main method we need to create object of class
		Assignment11_Call_NonStaticMethods_In_MainMethod Asgn4= new Assignment11_Call_NonStaticMethods_In_MainMethod();
		Asgn4.Subtraction();
		Asgn4.Multiplication(4, 8);
	}
}
