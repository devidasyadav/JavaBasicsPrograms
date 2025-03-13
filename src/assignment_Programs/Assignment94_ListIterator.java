package assignment_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment94_ListIterator 
{
	public static void main(String[] args) 
	{
		List<String> s1= new ArrayList<String>();
		s1.add("justin");
		s1.add("dsouza");
		s1.add("john");
		s1.add("mathews");
		System.out.println(s1);
		
		System.out.println("listIterator Forward");
		ListIterator<String> i3 = s1.listIterator();
		
		while(i3.hasNext())
		{
		System.out.println(i3.next());
		}
		System.out.println("listIterator Backward");
		while(i3.hasPrevious())
		{
		System.out.println(i3.previous());
		}
	}

}
