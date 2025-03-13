package assignment_Programs;

public class Assignment14_NonStatic_Para 
{
	void addition(int a, int b)
	{
		int sum=a+b;
		System.out.print("calling addition method with two int parameter: ");
		System.out.println(" Addition of numbers = "+sum);
	}
	
	void addition(int a, int b, boolean flag)
	{
		if(flag==true)
		{
			int sum=a+b;
			System.out.print("calling addition method with two int parameter and boolean : ");
			System.out.println("Addition of numbers = "+sum);
		}
		else
		{
		int sub=a-b;
		System.out.print("calling addition method with two int parameter and boolean :");
		System.out.println(" Subtration of numbers = "+sub);
		}
	}
	
	void div(double c, int d)
	{
		double div =c/d;
		System.out.print("calling div method with double & int parameter :");
		System.out.println(" division of numbers = "+div);
	}
	
	void multply(float c, int d)
	{
		double mult =c*d;
		System.out.print("calling div method with double & int parameter :");
		System.out.println(" multiplication of numbers = "+mult);
	}

	public static void main(String[] args) 
	{
		Assignment14_NonStatic_Para asgn= new Assignment14_NonStatic_Para();
		asgn.addition(12, 3);
		asgn.addition(23, 6, true);
		asgn.addition(23, 6, false);
		asgn.div(23.6, 8);
		asgn.multply(33.6f, 8);
	}
}
