package assignment_Programs;

import java.util.Arrays;

public class Assignment73_toCharArray {

	public static void main(String[] args) {
		// WAP on String Function using toCharArray concept
		String input= "To maintain health, exercise is important";
		char array1[]= input.toCharArray();
		
		for(int i=0;i< array1.length; i++)
		{
			System.out.print(array1[i]);
		}
		System.out.println("Another way to print it: ");
		System.out.println(Arrays.toString(array1));
	}

}
