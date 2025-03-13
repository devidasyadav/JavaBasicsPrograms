package assignment_Programs;
class AmazonEcommerce
{
	void login()
	{
		System.out.println("Login into app");
	}
	
	void addToCart()
	{
		System.out.println("Add product to cart");
	}
}
public class Assignment39_SLI extends AmazonEcommerce
{
	void launchBrowser()
	{
		System.out.println("Launch chrome browser");
	}
	void logoutApp()
	{
		System.out.println("Logout from app");
	}
	
	public static void main(String[] args) 
	{
		Assignment39_SLI ob1=new Assignment39_SLI();
		ob1.launchBrowser();
		ob1.login();
		ob1.addToCart();
		ob1.logoutApp();
	}
}
