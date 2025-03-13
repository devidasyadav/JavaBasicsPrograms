package module1_Programs;

public class GlobalVariable3 
{ // updating values of global variables static/non static
//	int a; global cannot be initialized in one line and declared on next line (applicable to both static & non static)
//	a=23; 
	int b=25;
	//b=36; not possible
	static double c=9.2;
	//c=9.6; not possible
	// update is possible in main method or any other method also
	static void updateGlobalVariables()
	{
		// global variable update
		GlobalVariable3 gv3 = new GlobalVariable3();
		gv3.b=100; // updating global non static variable
		System.out.println(gv3.b);
				
		c=9.7; //updating global static variable
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		
		int num=20; //local variable
		num=35; // local variable can be declared and updated value in next line
		System.out.println(num);

		// global variable update
		GlobalVariable3 gv3 = new GlobalVariable3();
		gv3.b=50; // updating global non static variable
		System.out.println(gv3.b);
		
		c=9.6; //updating global static variable
		System.out.println(c);
		
		updateGlobalVariables();
	}

}
