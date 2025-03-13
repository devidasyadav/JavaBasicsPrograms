package assignment_Programs;

public class Assignment88_ConstructorStringBuilder 
{//WAP on constructors of a String Buffer and constructors of a String Builder
	public static void main(String[] args) 
	{
		StringBuffer s1= new StringBuffer();
		s1.append("My school name is SNBP school");
		System.out.println(s1);
		
		StringBuffer s2= new StringBuffer("Manish Kumar Tiwari");
		System.out.println(s2);
		
		StringBuffer s3= new StringBuffer(25);
		System.out.println(s3);
		
		StringBuilder s4= new StringBuilder();
		System.out.println(s4);
		
		StringBuilder s5= new StringBuilder("Manish Kumar Tiwari");
		System.out.println(s5);
		
		StringBuilder s6= new StringBuilder(25);
		System.out.println(s6);
	}

}
