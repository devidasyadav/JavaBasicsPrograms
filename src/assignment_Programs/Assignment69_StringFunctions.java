package assignment_Programs;

public class Assignment69_StringFunctions 
{
	public static void main(String[] args)
	{
		//WAP on String Function using equals and equalsIgnoreCase concept
		String s1 = "School";
		System.out.println(s1.equals("SChool"));
		System.out.println(s1.equals("School"));
		
		String s2 = "SCHool";
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.equalsIgnoreCase("Schooll"));
	}
}
