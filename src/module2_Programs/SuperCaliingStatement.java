package module2_Programs;
class Google
{
	Google()
	{
		System.out.println("this is supermost constructor with parameter");
	}
}
class Google1 extends Google
{
	Google1(String Name)
	{
		super();
		System.out.println("this is super constructor with parameter");
	}
}
public class SuperCaliingStatement extends Google1
{
	SuperCaliingStatement(boolean flag)
	{
		super("Devidas");
		System.out.println("this is child constructor with parameter");
	}
	
	public static void main(String[] args) 
	{
		new SuperCaliingStatement(true);
	}
}
