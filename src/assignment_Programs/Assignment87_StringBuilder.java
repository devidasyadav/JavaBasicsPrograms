package assignment_Programs;
public class Assignment87_StringBuilder
{// WAP on String Builder using Append, insert, delete, substring, reverse, Capacity, replace
	public static void main(String[] args) 
	{	//String Buffer is mutable - Java 1.0
		StringBuffer s4= new StringBuffer("Devidas ");
		System.out.println("Initial String Buffer: ");
		System.out.println(s4);
		
		System.out.println("append");
		s4.append(" Hanumant Yadav");
		System.out.println(s4);
		
		System.out.println("Insert");
		s4.insert(8, "Maina");
		System.out.println(s4);
		
		System.out.println("Replace");
		s4.replace(14, 22, "Appa");
		System.out.println(s4);
		
		System.out.println("delete");
		s4.delete(8, 14);
		System.out.println(s4);
		
		System.out.println("Substring");
		System.out.println(s4.substring(0, 7));
		
		System.out.println("Reverse");
		s4.reverse();
		System.out.println(s4);
		
		System.out.println("Capacity");
		System.out.println(s4.capacity());
	}

}
