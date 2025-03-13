package assignment_Programs;

public class Assignment9_LogicalOperators 
{
	public static void main(String[] args) 
	{
		int a=10, b=20, c=20;
		if (a<b && b==c)
		{
			int d=a+b+c;
			//WHen both conditions are true
			System.out.println("The sum is : "+d);
		}
		else
		{
			System.out.println("One of condition is false");
		}
		// NOT AND (Will give output opposite of AND
		if (!(a<b && b==c))
		{
			int d=a+b+c;
			//WHen both conditions are true
			System.out.println("NOT AND - The sum is : "+d);
		}
		else
		{
			System.out.println("NOT AND - One of condition is false");
		}
		
		int d=10, e=1, f=10, g=30;
		//using logical OR 
		if (d>e || f==g)
		{
			System.out.println("One or Both the conditions are True: OR Operator");
		}
		else
		{
			System.out.println("Both the conditions are false: OR Operator");
		}
		
		if (!(d>e || f==g))
		{
			System.out.println("NOT OR: One or Both the conditions are True");
		}
		else
		{
			System.out.println("NOT OR: Both the conditions are false");
		}
	}
}
