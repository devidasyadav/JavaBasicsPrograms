package assignment_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment95_Set 
{//WAP on Set concepts using its methods
public static void main(String[] args) 
{
	Set<Integer> s1= new HashSet<Integer>();
	s1.add(15);
	s1.add(85);
	s1.add(63);
	s1.add(14);
	s1.add(null);
	s1.add(1);
	s1.add(85);
	s1.add(null);
	System.out.println(s1);
	//set does not follow indexing
	s1.remove(null);
	System.out.println("Iterator: ");
	Iterator<Integer> i1= s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	s1.clear();
	System.out.println("clearing set");
	System.out.println(s1);
	System.out.println(s1.isEmpty());
	
	
}
}
