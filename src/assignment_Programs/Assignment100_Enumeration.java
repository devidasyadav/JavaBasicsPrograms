package assignment_Programs;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment100_Enumeration 
{//
	public static void main(String[] args) 
	{
		Vector<Object> v= new Vector<Object>();
		v.add("Devidas");
		v.add(true);
		v.add(12);
		v.add(3.69);
		v.add('S');
		v.add(9552203514L);
		System.out.println(v);

		System.out.println("Using Enumeration");
		Enumeration<Object> e1= v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
