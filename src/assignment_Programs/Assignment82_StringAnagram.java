package assignment_Programs;

import java.util.Arrays;

public class Assignment82_StringAnagram 
{//WAP to find out if the given 2 strings are anagram                
	public static void main(String[] args) 
	{
		String s1="fired";
		String s2="fried";
		char c1[]=s1.toCharArray();
		char c2 []=s2.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
		Arrays.sort(c2);
		System.out.println(c2);
		boolean b1 = Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagrams");
		}
		
	}

}
