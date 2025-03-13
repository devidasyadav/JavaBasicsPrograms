package module2_Programs;

public class Method_Overloading 
{

	static void add()
	{
		System.out.println("1");
	}
	
	static void add(int a)
	{
		System.out.println("2");
	}
	static void add(int b,float c)
	{
		System.out.println("3");
	}
	static void add(int b,double c)
	{
		System.out.println("4");
	}
	
	static void add(double b,int c)
	{
		// here variation is order of parameters
		System.out.println("5");
	}
	
//    void add(double b,int c)
//	{
//		// this is not allowed as we have static method with same method signature
//		
//	}
	// Non static methods overloading
	void sub(int a)
	{
		System.out.println("6");
	}
	
	void sub(int a, boolean flag)
	{
		System.out.println("7");
	}
	
	public static void main(String[] args) 
	{
		// static method overloading
		add();
		add(23);
		add(253, 2.3f);
		add(12, 3.66);
		add(23.66, 45);
		
		Method_Overloading mo=new Method_Overloading();//object creation
		//non static method overloading
		mo.sub(33);
		mo.sub(6, false);
		

	}

}
