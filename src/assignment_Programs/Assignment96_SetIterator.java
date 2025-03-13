package assignment_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment96_SetIterator 
{//WAP to iterate a Set using Iterator
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
	}

}
