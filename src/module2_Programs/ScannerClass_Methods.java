package module2_Programs;

import java.util.Scanner;

public class ScannerClass_Methods 
{
	public static void main(String[] args)
	{	
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name=s1.next();
		System.out.println(name);
		
		System.out.println("enter int: ");
		int a=s1.nextInt();
		System.out.println(a); 
		
		System.out.println("enter byte: ");
		byte b=s1.nextByte();
		System.out.println(b);
		
		System.out.println("enter float: ");
		 float c=s1.nextFloat();
		System.out.println(c);
		
		System.out.println("enter double: ");
		 double d=s1.nextDouble();
		System.out.println(d);
		
		System.out.println("enter short : ");
		short e =s1.nextShort();
		System.out.println(e);
		
		System.out.println("enter long : ");
		long f =s1.nextLong();
		System.out.println(f);
		
		System.out.println("enter boolean : ");
		boolean g =s1.nextBoolean();
		System.out.println(g);
		
		s1.close();
	}

}
