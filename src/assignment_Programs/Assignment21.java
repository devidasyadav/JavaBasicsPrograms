package assignment_Programs;
public class Assignment21 
{
	//WAP for static and non static global variables and utilize them in both static and non static methods
	double pi=3.14;//any global variable which is non static is called instance variable
	// we need to create an object to access non static variable
	static double r=10;
	
	static void areaofCircle()
	{
		Assignment21 gv2= new Assignment21();
		double area= gv2.pi*r*r;
		System.out.println("The area of circle: "+area);
	}
	void circumfernceOfCircle()
	{    
		Assignment21 gv2= new Assignment21();
		double circumfernce= 2*gv2.pi*r;
		System.out.println("The circumfernce Of Circle: "+circumfernce);
	}
	public static void main(String[] args)
	{
		areaofCircle();
		Assignment21 gv2= new Assignment21();
		gv2.circumfernceOfCircle();
	}
}
