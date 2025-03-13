package assignment_Programs;

public class Assignment68_StringFunction2 
{

	public static void main(String[] args) 
	{
		// WAP on String Function using concatenation and contains concept
		String input="Devidas";
		System.out.println(input.concat(" Hanumant Yadav"));
		
		String i1="Food";
		String i2="is";
		String i3="Tasty";
		System.out.println(i1.concat(" ").concat(i2).concat(" ").concat(i3));
		
		//contains
		String name="Jitendra Kumar Gupta";
		System.out.println(name.contains(input));
		System.out.println(name.contains("kumar"));//it should be exact match
		System.out.println(name.contains("Kumar"));
	}

}
