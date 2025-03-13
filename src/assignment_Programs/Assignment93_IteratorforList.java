package assignment_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment93_IteratorforList 
{
	public static void main(String[] args) 
	{
		List<String> s1= new ArrayList<String>();
		s1.add("justin");
		s1.add("dsouza");
		s1.add("john");
		s1.add("mathews");
		System.out.println(s1);
		System.out.println("iterator cursor");
		Iterator<String> j1=s1.iterator();
		while (j1.hasNext())
		{
			System.out.println(j1.next());
		} 
	}

}
