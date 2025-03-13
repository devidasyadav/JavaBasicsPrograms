package module1_Programs;

public class GlobalVariable2
{
	double pi=3.14;//any global variable which is non static is called instance variable
	// we need to create an object to access non static variable
	static double r=10;
	
	public static void main(String[] args)
	{
		System.out.println("The area of circle:");
		GlobalVariable2 gv2= new GlobalVariable2();
		double area= gv2.pi*r*r;
		System.out.println(area);

	}

}
