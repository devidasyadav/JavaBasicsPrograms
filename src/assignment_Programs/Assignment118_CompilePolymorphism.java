package assignment_Programs;

public class Assignment118_CompilePolymorphism 
{
	void add(int a, int b)
	{
		System.out.println("method with two parameters "+a+" "+b);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("method with three parameters "+a+" "+b+" "+c);
	}
	public static void main(String[] args) 
	{
		Assignment118_CompilePolymorphism cp1= new Assignment118_CompilePolymorphism();
		cp1.add(23,4);
		cp1.add(2, 3, 5);
	}

}
