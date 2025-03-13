package assignment_Programs;
class Google3
{
	final void login()
	{
		System.out.println("login with mobile number");
	}
}

public class Assignment48_FinalMethod extends Google3
{
//	void login()
//	{// will not allow to create method as same name login because it is final
//		System.out.println("login with email id");
//	}
	
	public static void main(String[] args) 
	{
		Assignment48_FinalMethod obj=new Assignment48_FinalMethod();
		obj.login();
	}
}
