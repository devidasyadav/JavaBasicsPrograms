package assignment_Programs;
abstract class program3
{
	abstract void login();//abstract method
	abstract void paymentGateway();//abstract method
	
	void addToCart()
	{//concrete non static method
		System.out.println("Add product into cart");
	}
	
	static void LoadDashboard()
	{//concrete static method
		System.out.println("load course dashboard");
	}
}
public class Assignment50_Abstract_ConcreteMethods extends program3
{
	void login() 
	{
		System.out.println("Hide login implementation");
	}
	void paymentGateway() 
	{
		System.out.println("third party payment");
	}
	
	public static void main(String[] args) 
	{
		Assignment50_Abstract_ConcreteMethods obj= new Assignment50_Abstract_ConcreteMethods();
		obj.login();
		LoadDashboard();
		obj.addToCart();
		obj.paymentGateway();
	}
}
