package assignment_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment77_ArrayEquals 
{// WAP to check if 2 arrays are equals to each other at run time
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter array size of Marks1: ");
		int [] Marks1= new int[s1.nextInt()];
		for(int i=0;i<Marks1.length;i++)
		{
			System.out.println("enter value of element "+i+" : ");
			Marks1[i]=s1.nextInt();
		}
		System.out.println("Your entered array Marks1 is : "+ Arrays.toString(Marks1));
		
		System.out.println("Please enter array size of Marks2: ");
		int [] Marks2= new int[s1.nextInt()];
		for(int i=0;i<Marks2.length;i++)
		{
			System.out.println("enter value of element "+i+" : ");
			Marks2[i]=s1.nextInt();
		}
		System.out.println("Your entered array Marks2 is : "+ Arrays.toString(Marks2));
		if(Marks1.length==Marks2.length)
		{
			if(Arrays.equals(Marks1, Marks2))
			{
				System.out.println("Arrays are equal");
			}
			else
			{
				System.out.println("Arrays are not equal");
			}
		}
		else
		{
			System.out.println("arrays cannot be compared since size is different");
		}
		s1.close();
	}

}
