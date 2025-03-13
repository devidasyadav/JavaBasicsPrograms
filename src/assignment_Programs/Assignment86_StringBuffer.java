package assignment_Programs;
public class Assignment86_StringBuffer 
{//WAP on String Buffer using Append, insert, replace, delete, substring, reverse, Capacity
	public static void main(String[] args) 
	{
		//String Builder is mutable - Java 1.5
		StringBuffer s3= new StringBuffer("Devidas ");
		System.out.println("Initial String Buffer: ");
		System.out.println(s3);
		
		System.out.println("append");
		s3.append(" Hanumant Yadav");
		System.out.println(s3);
		
		System.out.println("Insert");
		s3.insert(8, "Maina");
		System.out.println(s3);
		
		System.out.println("Replace");
		s3.replace(14, 22, "Appa");
		System.out.println(s3);
		
		System.out.println("delete");
		s3.delete(8, 14);
		System.out.println(s3);
		
		System.out.println("Substring");
		System.out.println(s3.substring(0, 7));
		
		System.out.println("Reverse");
		s3.reverse();
		System.out.println(s3);
		
		System.out.println("Capacity");
		System.out.println(s3.capacity());
		//string concept
//		String s1= new String("Devidas");
//		String s2 = s1.concat(" Hanumant Yadav");
//		System.out.println(s1);
//		System.out.println(s2);//Sting is immutable
		
	}

}
