package assignment_Programs;
class amazon1
{
	amazon1()
	{
		System.out.println("This is supermost constructor");
	}
}
class amazon2 extends amazon1
{
	amazon2()
	{
		super();//"Implicitly Explicitly"	
		System.out.println("This is super/parent constructor");
	}
}
public class Assignment42_SuperCallingStatement extends amazon2
{
	Assignment42_SuperCallingStatement()
	{
		super(); //"Implicitly Explicitly"
		System.out.println("This is child class constructor");
	}
	
	public static void main(String[] args)
	{
		new Assignment42_SuperCallingStatement();
	}
}
