package assignment_Programs;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment62_nestedtrycatch 
{
	//WAP on Exception handling using nested try catch keywords
	public static void main(String[] args) 
	{
		try 
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = s1.nextInt();
		System.out.println("Your age is: "+age);
		s1.close();
		}
		catch(InputMismatchException e1)
		{
			try 
			{
				Scanner s1=new Scanner(System.in);
				System.out.println("Please enter your age [must be int]: ");
				int age = s1.nextInt();
				System.out.println("Your age is: "+age);
				s1.close();
			}
			catch(InputMismatchException e2)
			{
				System.out.println("InputMismatchException is handled again: please contact to admin ");
			}
		}

	}
}
