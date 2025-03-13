package module1_Programs;

public class GlobalVariable 
{
	static int a=200;//global variable can be static or non static
	static int b=10;// scope of global variable is start of class till end of class "GlobalVariable"
	
	static void addition()
	{
		int c= 35;//local variable // local cannot be distinguished into static or non static
		System.out.println(a+b+c);
	}
	static void subtraction() 
	{ //int sub=a-b-c; not possible as c is local variable in method addition, we cannot use it in this method
		System.out.println(a-b);
	}
	static void multiplication()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		multiplication();
	}

}
