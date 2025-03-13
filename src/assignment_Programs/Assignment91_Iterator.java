package assignment_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment91_Iterator 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a1= new ArrayList<Object>();
		//Collection<Object> a1= new ArrayList<Object>();
		a1.add(10);
		a1.add("devidas");
		a1.add(12);
		a1.add(true);
		a1.add("Yadav");
		a1.add(1, 23.6);
		a1.remove(1);
		a1.remove("Yadav");
		a1.add(33.9);
		a1.add('C');
		a1.add(63);
		a1.add("Yadav");
		System.out.println(a1);
		Iterator<Object> i1= a1.iterator();
		//Iterator interface has hasNext(), next(), remove() methods
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
