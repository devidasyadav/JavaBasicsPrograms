package module1_Programs;

public class FinalVariable3 
{
	static int a=10;
	int a2=100;
	static int a3;
	static int s=90;
	public static void main(String[] args) 
	{
		s=900;
		int a1=20;
		a=19;
		a1=20;
		System.out.println(a);
		System.out.println(a3);
		System.out.println(s);
		FinalVariable3 fv3= new FinalVariable3();
		System.out.println(fv3.a2);
		System.out.println(a1);
	}
}
