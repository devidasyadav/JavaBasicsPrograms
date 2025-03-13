package assignment_Programs;

public class Assignment60_SIB_IIB 
{
	{
		System.out.println("IIB execution1");
	}
	{
		System.out.println("IIB execution2");
	}
	{
		System.out.println("IIB execution3");
	}
	 
	Assignment60_SIB_IIB()
	{
		System.out.println("constructor execution");
	}
	static
	{
		System.out.println("SIB execution3");
	}
	
	static
	{
		System.out.println("SIB execution1");
	}
	static
	{
		System.out.println("SIB execution2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method execution1");
		new Assignment60_SIB_IIB();
		System.out.println("main method execution2");
	}

}
