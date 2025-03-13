package assignment_Programs;
public class Assignment67_StringFunction1 
{
	public static void main(String[] args) 
	{
		// WAP on String Function using toupperCase,toLowerCase,length,charAt,trim concepts
		String a= " Going to office ";
		System.out.println(a.toUpperCase());
		System.out.println("Length of string a: "+a.length());// length includes space as well
		
		String b= "OFFICE HOURS";
		System.out.println(b.toLowerCase());
		System.out.println("Length of string b: "+b.length());
		
		String c="Devidas_Yadav";
		System.out.println("charAt : "+c.charAt(8));
		
		String d= "  Classes are going on     ";
		System.out.println(d);
		System.out.println(d.trim());// trim will remove space at starting and ending of String
	}

}
