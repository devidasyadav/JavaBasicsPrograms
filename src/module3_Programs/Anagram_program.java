package module3_Programs;

import java.util.Arrays;

public class Anagram_program {

	public static void main(String[] args) {
		// WAP to check whether two strings are anagram
		String s1="firwed";
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
