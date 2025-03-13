package assignment_Programs;
public class Assignment84_StringFunction 
{// "WAP on string functions using replace, replaceAll, substring, matches, repeat"
	public static void main(String[] args)
	{	String s1= new String("summer has started early this time");
		System.out.println(s1);
		String s2= s1.replace('s', 't');//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println(s2);
		String s3= s2.replace("tummer", "summer");// replace(charSequece, charSequence)
		//Replaces each substring of this string that matches the literal targetsequence with the specified literal replacement sequence
		System.out.println(s3);
	
		String name="DEvidas2 Hanumant YAd3av 123 ";
		String name1=name.replaceAll("[A-Z]", "");
		System.out.println(name1);
		
		String name2=name.replaceAll("[a-z]", "");
		System.out.println(name2);
		
		String name3=name.replaceAll("[0-9]", "X");
		System.out.println(name3);
		// Matches
		String a="allan";
		boolean b1= a.matches(".....");
		System.out.println(b1);
		// ends with n
		boolean b2= a.matches("(.)*n");
		System.out.println(b1);
		boolean b3= a.matches("a(.)*");
		System.out.println(b3);
		//check if given string has man in it
		String input="shaktiman";
		boolean b4=input.matches("(.)*man(.)*");
		System.out.println(b4);
		//repeat
		String name4="aditi";
		System.out.println(name4.repeat(4));
		//substring
		String input1= "SNBP school opposite to GMall";
		System.out.println(input1.substring(12));
		System.out.println(input1.substring(5,11)); // here second index is n+1
		
	}

}
