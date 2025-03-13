package assignment_Programs;
class lauchBrowser
{
	static void launchEdgeBrowser()
	{
		System.out.println("Launch edge browser");
	}
}
class login extends lauchBrowser
{
	static void loginIntoApp()
	{
		System.out.println("Login into application");
	}
}
public class Assignment40_MuliLevelInheritance extends login
{
	static void TestCase1()
	{
		System.out.println("Validate home page banner");
	}
	public static void main(String[] args) 
	{
		launchEdgeBrowser();
		loginIntoApp();
		TestCase1();
		
	}
}
