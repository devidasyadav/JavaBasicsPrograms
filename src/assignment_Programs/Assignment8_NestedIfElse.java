package assignment_Programs;

public class Assignment8_NestedIfElse 
{
	public static void main(String[] args) 
	{
		int a=21;
		if(a>0)
		{
			System.out.println("Number is positive");
			if(a%2==0)
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is odd");
			}
		}
		else
		{
			System.out.println("Number is negative");
		}
	}
}
