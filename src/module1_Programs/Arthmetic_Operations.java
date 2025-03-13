package module1_Programs;

public class Arthmetic_Operations 
{
	static void add()
	{
		float a=25.36f;
		float b=36.25f;
		float sum=a+b;
		System.out.println("Addition of "+a+" & "+b+" is equal to: "+sum);
	}
	static void sub()
	{
		double a=25.364646787;
		float b=11.254f;
		double sub=a-b;
		System.out.println("Subtraction of "+a+" & "+b+" is equal to: "+sub);
	}
	
	static void multiplication()
	{
		int a=256;
		int b=113;
		int mult=a*b;
		System.out.println("Multiplication of "+a+" & "+b+" is equal to: "+mult);
	}
	
	static void division()
	{
		int a=256;
		int b=8;
		int div=a/b;
		System.out.println("Division of "+a+" & "+b+" is equal to: "+div);
	}
	
	static void modulus()
	{
		int a=18;
		int b=8;
		int mod=a%b;
		System.out.println("Modulus of "+a+" & "+b+" is equal to: "+mod);
	}
	public static void main(String[] args) 
	{
		//arithmetic operations and static method calling in main method 
		add();// calling static method, we just can call it by its name
		sub();
		multiplication();
		division();
		modulus();
	}

}
