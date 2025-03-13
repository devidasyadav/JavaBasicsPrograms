package module2_Programs;
abstract class program1
{
	abstract void add();
	abstract void sub();
}
public class Abstract_Study extends program1
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
		Abstract_Study am =new Abstract_Study();
		am.add();
		am.sub();
	}

}
