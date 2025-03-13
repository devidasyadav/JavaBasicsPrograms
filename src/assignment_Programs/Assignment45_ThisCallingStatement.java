package assignment_Programs;

public class Assignment45_ThisCallingStatement 
{
	Assignment45_ThisCallingStatement()
	{
		this(24);
		System.out.println("1");
	}
	Assignment45_ThisCallingStatement(int a)
	{
		this(34.2,'F');
		System.out.println("2");
	}
	Assignment45_ThisCallingStatement(double b, char c)
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) 
	{
		new Assignment45_ThisCallingStatement();
	}
}
