package assignment_Programs;

public class Assignment20_FinalVariable 
{
	//WAP on Final Variable
	final static int a=10;
	final int b=55;
	static void add()
	{  //double a=3.5;
		System.out.println(a+a);
	}
	public static void main(String[] args) 
	{
		Assignment20_FinalVariable fv= new Assignment20_FinalVariable();
		//fv.b=56; since b is final we cannot update b 
		System.out.println(fv.b);
		add();
	}
	

}
