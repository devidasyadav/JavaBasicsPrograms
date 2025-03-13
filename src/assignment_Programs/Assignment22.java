package assignment_Programs;
public class Assignment22 
{
	//WAP to update static and non static global variable
		int b=25;
		static double c=9.2;
		// update is possible in main method or any other method also
		static void updateGlobalVariables()
		{
			// global variable update
			Assignment22 gv3 = new Assignment22();
			gv3.b=100; // updating global non static variable
			System.out.println(gv3.b);
					
			c=9.7; //updating global static variable
			System.out.println(c);
		}
		
		public static void main(String[] args) 
		{
			// global variable update
			Assignment22 gv3 = new Assignment22();
			gv3.b=50; // updating global non static variable
			System.out.println(gv3.b);
			c=9.6; //updating global static variable
			System.out.println(c);
			
			updateGlobalVariables();
		}
}
