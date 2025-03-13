package assignment_Programs;

public class Assignment15_Static_Para 
{
	static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.print("calling addition method with two int parameter: ");
		System.out.println(" Addition of numbers = "+sum);
	}
	
	static void div(double c, int d)
	{
		double div =c/d;
		System.out.print("calling div method with double & int parameter :");
		System.out.println(" division of numbers = "+div);
	} 
	
	static void multply(float c, int d)
	{
		double mult =c*d;
		System.out.print("calling div method with double & int parameter :");
		System.out.println(" multiplication of numbers = "+mult);
	}

	public static void main(String[] args) 
	{
		addition(12, 3);
		div(23.6, 8);
		multply(33.6f, 8);
	}
}
