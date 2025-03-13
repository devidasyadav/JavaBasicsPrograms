package assignment_Programs;
interface gmail
{
	void loginIntoGmail();
}

interface yahoo
{
	void loginIntoyahoo();
}
public class Assignment53_MultipleLevel_Inheritance implements yahoo, gmail
{

	public void loginIntoGmail() 
	{
		System.out.println("Login into gmail");
	}

	public void loginIntoyahoo() 
	{
		System.out.println("Login into yahoo");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Multiple Level Inheritance using interface");
		Assignment53_MultipleLevel_Inheritance obj=new Assignment53_MultipleLevel_Inheritance();
		obj.loginIntoGmail();
		obj.loginIntoyahoo();
	}

}
