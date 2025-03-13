package assignment_Programs;
class GoogleAuth
{
	void login()
	{
		System.out.println("Login using mobile number");
	}
}
public class Assignment44_MethodOverriding extends GoogleAuth
{
	void login()
	{
		System.out.println("Login using email id");
	}
	
	public static void main(String[] args) 
	{
		Assignment44_MethodOverriding obj1=new Assignment44_MethodOverriding();
		obj1.login();
	}
}
