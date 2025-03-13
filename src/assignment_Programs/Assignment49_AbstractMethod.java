package assignment_Programs;

abstract class program2
{
	abstract void add();
	abstract void sub();
}
public class Assignment49_AbstractMethod 
{
	void add() 
	{
		System.out.println("Real implementation add ");
	}

	void sub() 
	{
		System.out.println("Real implementation sub ");
	}
	
	public static void main(String[] args)
	{
		Assignment49_AbstractMethod am =new Assignment49_AbstractMethod();
		am.add();
		am.sub();
	}
}
