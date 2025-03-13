package assignment_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Assignment89_Collection1 
{/*WAP on collection concept with the help of Upcasting on 
Different Data types (Int, Char, Double, string etc.) 
with different methods like Add, Remove, Contains.*/	
	public static void main(String[] args)
	{
		ArrayList<Object> a1= new ArrayList<Object>();
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
		System.out.println(a1);
		boolean b1= a1.contains(63);
		System.out.println(b1);
		
		Collection<Integer> c1 = new ArrayList<Integer>();//Up casting
		c1.add(63);
		c1.add(78);
		c1.add(36);
		c1.add(3);
		c1.add(12);
		System.out.println(c1);
		
		Collection<Integer> c2 = new ArrayList<Integer>();//Up casting
		c2.add(23);
		c2.add(14);
		c2.add(3);
		c2.add(30);
		c2.add(120);
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c2);
		System.out.println(c2.containsAll(a1));
		
		Collection<Double> c3 = new ArrayList<Double>();//Up casting
		c3.add(89.36);
		c3.add(96.2);
		c3.add(84.3);
		c3.add(12.2);
		c3.add(09.36);
		c3.add(1.2);
		System.out.println(c3);
		ArrayList<String> c4 = new ArrayList<String>();//Up casting
		c4.add("Devidas");
		c4.add("Priya");
		c4.add("Adesh");
		c4.add("Lakhan");
		c4.add("Ramesh");
		System.out.println(c4);
		Collections.sort(c4);
		System.out.println(c4);
	}

}
