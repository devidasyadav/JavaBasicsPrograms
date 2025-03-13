package module1_Programs;

public class AmazonApp 
{
	AmazonApp()
	{
		System.out.println("This is 1st Constructor");
	}
	
	AmazonApp(int a)
	{
		System.out.println("This is 2nd Constructor");
	}
	
	AmazonApp(int a, double b)
	{
		System.out.println("This is 3rd Constructor");
	}

	public static void main(String[] args) 
	{
		//constructor over loading
		new AmazonApp();
		new AmazonApp(23);
		new AmazonApp(11, 33.31);
	}

}
