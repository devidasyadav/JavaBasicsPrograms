package assignment_Programs;
public class Assignment54_AccessSpecifier 
{
	public static void add()
	{
		System.out.println("Public static method in same class");
	}
	static void sub()
	{
		System.out.println("default/package static method in same class");
	}
	protected static void mult()
	{
		System.out.println("protected static method in same class");
	}
	private static void div()
	{
		System.out.println("private static method in same class");
	}
	
	public  void add1()
	{
		System.out.println("Public  non static method in same class");
	}
	 void sub1()
	{
		System.out.println("default/package  non static method in same class");
	}
	protected  void mult1()
	{
		System.out.println("protected  non static method in same class");
	}
	private  void div1()
	{
		System.out.println("private  non static method in same class");
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		mult();
		div();
		System.out.println("===============");
		Assignment54_AccessSpecifier obj = new Assignment54_AccessSpecifier();
		obj.add1();
		obj.sub1();
		obj.mult1();
		obj.div1();
	}
}
