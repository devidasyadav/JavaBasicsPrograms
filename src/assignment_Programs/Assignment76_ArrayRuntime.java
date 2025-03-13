package assignment_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment76_ArrayRuntime 
{//WAP to accept the values of your array at run time
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter array size: ");
		int [] age= new int[s1.nextInt()];
		for(int i=0;i<age.length;i++)
		{
			System.out.println("enter value of element "+i+" : ");
			age[i]=s1.nextInt();
		}
		System.out.println("Your entered array is : "+ Arrays.toString(age));
		s1.close();
	}

}
