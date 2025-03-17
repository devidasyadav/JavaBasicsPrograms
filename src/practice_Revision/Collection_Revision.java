package practice_Revision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection_Revision 
{
	public static void main(String[] args) 
	{
		List<Object> a1= new LinkedList<Object>();
		//Collection<Object> a1= new ArrayList<Object>();
		a1.add(10);
		a1.add("devidas");
		a1.add(12);
		a1.add(true);
		a1.add("Yadav");
		System.out.println(a1);
		a1.add(1, 23.6);
		System.out.println(a1);
		a1.remove(1);
		a1.remove("Yadav");
		System.out.println(a1);
		a1.add(33.9);
		a1.add('C');
		a1.add(63);
		a1.add("Yadav");
		a1.add(33.9);
		a1.add('C');
		a1.add(63);
		a1.add("Yadav");
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add("Yadav");
		System.out.println(a1);
		boolean b1= a1.contains(63);
		System.out.println(b1);
		Iterator<Object> i1=a1.iterator();
		System.out.println("Iterator:   ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("List Iterator:   ");
		ListIterator<Object> i2=a1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		//Enumeration e = a1.elements();
		ArrayList<Integer> c1 = new ArrayList<Integer>();//Up casting
		c1.add(63);
		c1.add(78);
		c1.add(36);
		c1.add(3);
		c1.add(12);
		Collections.sort(c1);
		System.out.println(c1);
		
	}

}
