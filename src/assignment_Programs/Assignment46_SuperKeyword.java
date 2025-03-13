package assignment_Programs;
class Google2
{
	void login()
	{
		System.out.println("login with mobile number");
	}
}

public class Assignment46_SuperKeyword extends Google2
{
	void login()
	{
		super.login();
		System.out.println("login with email id");
	}
	
	public static void main(String[] args) 
	{
		Assignment46_SuperKeyword obj=new Assignment46_SuperKeyword();
		obj.login();
	}
}
