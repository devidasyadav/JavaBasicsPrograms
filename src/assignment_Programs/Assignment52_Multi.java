package assignment_Programs;
interface GoogleSearch
{
	void Search();
	void Gmail();
	static void Gmail3()
	{
		System.out.println("Static method in interface");
	}
//	void Gmail4() we cannot add non static concrete method in interface
//	{
//		System.out.println();
//	}
	//static void Gmail2();  we cannot have static method as abstract
}
interface Flipkart extends GoogleSearch
{
	void Login();
	void AddToCart();
}
public class Assignment52_Multi implements Flipkart
{
	public void Search() 
	{
		System.out.println("Search method from GoogleSearch interface overriden in class");
	}

	public void Gmail() 
	{
		System.out.println("Gmail method from GoogleSearch interface overriden in class");
	}

	public void Login() 
	{
		System.out.println("Login method from Flipkart interface overriden in class");
	}

	public void AddToCart() 
	{
		System.out.println("AddToCart method from Flipkart interface overriden in class");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Multi Level Inheritance");
		Assignment52_Multi obj =new Assignment52_Multi();
		obj.Search();
		obj.Gmail();
		obj.Login();
		obj.AddToCart();
		GoogleSearch.Gmail3();
		
	}
}
