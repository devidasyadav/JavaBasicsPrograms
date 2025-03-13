package module1_Programs;

public class Constructor_Study 
{
	Constructor_Study()
	{
		System.out.println("This is constructor");
	}
	
	public static void main(String[] args) 
	{
		// constructor can be called by creating object, there are 2 ways to do it
		Constructor_Study cs1= new Constructor_Study();// reference variable
		new Constructor_Study();
	}
}
