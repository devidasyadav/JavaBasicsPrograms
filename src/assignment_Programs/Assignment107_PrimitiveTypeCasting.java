package assignment_Programs;

public class Assignment107_PrimitiveTypeCasting 
{
	public static void main(String[] args)
	{
		//Assignment107 Problem 1:Lets convert int into double. It is Widening -Implicitly Explicitly

		double d1 = 100;//Implicit syntax
		System.out.println("Widening Implicit : "+d1);

		int b=560;
		double c1 = b;//Implicit syntax
		System.out.println("Widening Implicit : "+c1);

		int a=200;
		double c2 = (double)a;//Explicit syntax
		System.out.println("Widening Explicit : "+c2);

		double d2 = (double)100;//Explicit syntax
		System.out.println("Widening Explicit : "+d2);

		//Assignment108 Problem 2:Lets convert double into int -Narrowing	Explicitly
		int d3= (int) 783.24;
		System.out.println("Narrowing Explicit: "+d3);
		
		//Assignment109 Problem 3:Lets convert double into float	
		float f1=(float) 2342.3467574564;
		System.out.println("Narrowing Explicit: "+f1);

		//Assignment110 Problem 4:Lets convert byte into int	
		byte b1= 127; //byte range -128 to 127
		int e1=b1;
		System.out.println(e1);

		//Assignment111 Problem 5:Lets convert int into byte
		byte b2=(byte) 755;
		System.out.println(b2);

		//Assignment112 Problem 6:Lets convert int 10000 into byte
		byte b3=(byte) 10000;
		System.out.println(b3);
		
		//Assignment113 WAP to convert short into byte
		byte b4=(byte) 32487;
		System.out.println(b4);
		
		//Assignment114 WAP to convert short into int	
		int i1 = 32487;
		System.out.println(i1);
		int i2 = (int)32487;
		System.out.println(i2);
		
		//Assignment115 WAP to convert float into double
		double db1= 2342.3467;
		System.out.println(db1);
	}

}
