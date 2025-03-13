package assignment_Programs;

public class Assignment16_MethodOverloading 
{
		public static void IntializeBrowser() //Static method
		{
			System.out.println("Static method without parameter_ Initialize browser");
		}
		
		public static void IntializeBrowser(String BrowserName)
		{
			System.out.println("Static method with parameter_ Initialize browser "+BrowserName);
		}
		
		public static void IntializeBrowser(String BrowserName,String OS)
		{
			System.out.println("Static method with parameter_ Initialize browser: "+BrowserName+"! Operating system: "+ OS);
		}
		
		public void Login()
		{
			System.out.println("Non Staic Method: Login");
		}
		public void Login(String Username,String Password)
		{
			System.out.println("Non Staic Method: Login with Username "+Username+ " & Password "+Password);
		}
		public void Login(long MobileNumber,int OTP)
		{
			System.out.println("Non Staic Method: Login with MobileNumber "+MobileNumber+ " & OTP "+OTP);
		}
		public static void main(String[] args) 
		{
			// WAP to call Method Overloading //Static Method Overloading
			IntializeBrowser();
			IntializeBrowser("Chrome");
			IntializeBrowser("Edge", "Windows");
			//Non Static Method Overloading //Creating object of class
			Assignment16_MethodOverloading mol1= new Assignment16_MethodOverloading();
			mol1.Login();
			mol1.Login("DevidasYadav", "Qwerty123456");
			mol1.Login(9882351420L, 809070);
		}
}
