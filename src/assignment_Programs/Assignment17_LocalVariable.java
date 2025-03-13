package assignment_Programs;

public class Assignment17_LocalVariable 
{
	
	static void addition()
	{
		int a=22;// local variable within scope of static addition method
		int b= 33;
		int sum = a+b;
		//int sub = c-d; we cannot access c & d here because it is defined locally in subtraction method
		System.out.println("Sum is "+sum);
	}
	void subtraction()
	{
		int c=22;// local variable within scope of non static subtraction method
		int d= 33;
		int sub = c-d;
		//int sum = a+b; we cannot access a & b here because it is defined locally in addition method
		System.out.println("Sub is "+sub);
	}
	

	public static void main(String[] args) 
	{
		addition();
		Assignment17_LocalVariable lv = new Assignment17_LocalVariable();
		lv.subtraction();
	}
}
