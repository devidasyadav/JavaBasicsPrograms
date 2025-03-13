package assignment_Programs;
class JavaProgram
{
	void login()
	{
		System.out.println("Login with email id");
	}
}
public class Assignment117_RuntimePolymorphism 
{
	void login()
	{
		System.out.println("Login with mobile number");
	}
	
	public static void main(String[] args) 
	{//WAP on Run time polymorphism (Method overriding)
		
		//parent class object
		JavaProgram p1 = new JavaProgram();
		p1.login();
		//child class object
		Assignment117_RuntimePolymorphism c1= new Assignment117_RuntimePolymorphism();
		c1.login();
	}

}
