package module2_Programs;

public class Logical_Operators 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=22;
		int c=5;
		//AND operator
		if(a<b && a==b)
		{
			System.out.println("And operator: TRUE");
		}
		else
		{
			System.out.println("And operator: FALSE");
		}

		//NOT AND operator
		if(!(a<b && a==b))
		{
			System.out.println("NOT And operator: TRUE");
		}
		else
		{
			System.out.println("NOT And operator: FALSE");
		}

		//OR operator
		if(a>c || a==b)
		{
			System.out.println("OR operator: TRUE");
		}
		else
		{
			System.out.println("OR operator: FALSE");
		}

		//NOT OR operator
		if(!(a>c || a==b))
		{
			System.out.println("NOT OR operator: TRUE");
		}
		else
		{
			System.out.println("NOT OR operator: FALSE");
		}
		// Multiple conditions with AND, OR operators
		if((a<c || a==22) && a!=b)
		{
			System.out.println("Mutlicondition : TRUE");
		}
		else
		{
			System.out.println("Mutlicondition : FALSE");
		}
	}

}
