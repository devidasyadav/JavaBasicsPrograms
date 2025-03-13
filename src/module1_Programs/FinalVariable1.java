package module1_Programs;

public class FinalVariable1 
{
	final static double pi=3.14159265;//global variable
	static void areaOfCircle()
	{
	    final double pi= 3.14; // local variable
		int radius=7;
		//pi=7; 
		System.out.println(pi);
		double area=pi*radius*radius;
		System.out.println("area of circle: "+area);
	}
	public static void main(String[] args) 
	{
		//pi=5; value of pi cannot be updated since its final be it global or local
		System.out.println(pi);
		areaOfCircle();
	}

}
