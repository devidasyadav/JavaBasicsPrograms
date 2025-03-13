package assignment_Programs;
class Google
{
	Google(int s)
	{
		System.out.println("this is supermost constructor with parameter");
	}
}
class Google1 extends Google
{
	Google1(String Name)
	{
		super(25);
		System.out.println("this is super constructor with parameter");
	}
}
public class Assignment43_SuperCallingPara extends Google1
{
	Assignment43_SuperCallingPara(boolean flag)
	{
		super("Devidas");
		System.out.println("this is child constructor with parameter");
	}
	
	public static void main(String[] args) 
	{
		new Assignment43_SuperCallingPara(true);
	}
}
