package assignment_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment64_finally
{
	public static void main(String[] args)
	{ Scanner s1= new Scanner(System.in);
	Scanner s2= new Scanner(System.in);
		try
		{
			System.out.println("Enter Your age: ");
			int age=s1.nextInt();
			System.out.println("Your age is "+age);;
		}
		catch(InputMismatchException a1)
		{   
			System.out.println("Enter Your age [it must be int] : ");
			int age=s2.nextInt();
			System.out.println("Your age is "+age);
		}
		finally
		{
			System.out.println("Finally block executed");
			s1.close();
			s2.close();
		}
	}
}
