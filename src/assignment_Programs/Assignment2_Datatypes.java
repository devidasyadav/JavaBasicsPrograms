package assignment_Programs;

public class Assignment2_Datatypes 
{

	public static void main(String[] args) 
	{
		// Assignment 2 WAP to declare and initialize all the data types and its value
		byte a = 126;
		//range of byte is -127 to 126
		System.out.println("Byte "+a);
		byte n=8;
		double Range= Math.pow(2, n-1);
		System.out.println("Range of byte is "+ -Range + " to "+ (Range-1));
		//Short
		short b= -32764;
		System.out.println("short "+b);
		n=16;
		Range= Math.pow(2, n-1);
		System.out.println("Range of Short is "+ -Range + " to "+ (Range-1));
		//Integer  
		int c= 56728;
		System.out.println("int "+c);
		n=32;
		Range= Math.pow(2, n-1); 
		System.out.println("Range of int is "+ String.format("%.0f", -Range) + " to "+ String.format("%.0f", (Range-1)));
		long d= 955220313343L;
		System.out.println("long "+d);
		n=64;
		Range= Math.pow(2, n-1); 
		System.out.println("Range of Long is "+ String.format("%.0f", -Range) + " to "+ String.format("%.0f", (Range-1)));
		//float
		float e= 56728.686f;
		System.out.println("float "+e);
		//double
		double f= 56728.6864546456;
		System.out.println("double "+f);
		//character
		char grade='A';
		System.out.println("Char "+grade);
		//boolean
		boolean flag=true;
		System.out.println("boolean "+flag);
		//String
		String name="My name is Devidas Yadav";
		System.out.println("String "+name);

	}
}
