package assignment_Programs;
interface Amazon
{
	// 2AM 
	void add();
	void sub();
}
public class Assignment51_Interface implements Amazon
{
	public void add() 
	{
		System.out.println("Abstract add method from Amazon Interface ");
	}

	public void sub() 
	{
		System.out.println("Abstract sub method from Amazon Interface ");
	}
	
	public static void main(String[] args) 
	{
		Assignment51_Interface obj = new Assignment51_Interface();
		obj.add();
		obj.sub();
	}
}
