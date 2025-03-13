package assignment_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) 
	{
		//WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario
		Scanner s2=new Scanner(System.in);
		try
		{
		System.out.println("Please enter array size: ");
		int rollNo[]= new int[s2.nextInt()];
		System.out.println("Array Size is : "+rollNo.length);
		}
		catch(InputMismatchException a1)
		{
			System.out.println("InputMismatch Exception Handled");
		}
		catch(NegativeArraySizeException a2)
		{
			System.out.println("NegativeArraySize Exception handled");
		}
		finally
		{
			s2.close();
		}
	}

}
