package module1_Programs;

public class GlobalVariable1 
{
	static byte a;
	short b;
	static int c; // global variable will have default value 
	long d;
	// for byte, short, int and long default value is 0
	static float f;
	double pi;
	// for float, double default value is 0.0
	static String Name; // String default value is null
	static boolean flag; // boolean default value is false
	//static char d; char does not have default value
	
	public static void main(String[] args) 
	{
		GlobalVariable1 gv1= new GlobalVariable1();
		System.out.println(a); 
		System.out.println(gv1.b);
		System.out.println(c); 
		System.out.println(gv1.d);
		System.out.println(f); 
		System.out.println(gv1.pi);
		System.out.println(Name);
		System.out.println(flag);
	}

}
