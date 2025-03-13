package assignment_Programs;

import java.util.Arrays;

public class Assignment80_ArraysMethods 
{
	public static void main(String[] args) 
	{
		//WAP on Array Function using Arrays.toString and Arrays.sort concept
		int Marks1 []= {12,36,45,78,96,11,3,66,70};
		Arrays.sort(Marks1);
		System.out.println(Arrays.toString(Marks1));
		
		int Marks2 []= {12,00,45,14,96,11,3,16,70};
		System.out.println("Check if Arrays are equal: ");
		System.out.println(Arrays.equals(Marks1, Marks2));
		System.out.println(Arrays.toString(Marks2));
	}

}
