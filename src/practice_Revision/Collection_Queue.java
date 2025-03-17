package practice_Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_Queue
{
	public static void main(String[] args) 
	{
		Queue<Integer> a1= new PriorityQueue<Integer>();
		//Collection<Object> a1= new ArrayList<Object>();
		a1.add(10);
		a1.add(12);
		a1.remove(1);
		a1.add(63);
		a1.add(63);
//		a1.add(null);
//		a1.add(null);
//		a1.add(null);
		a1.add(66);
		a1.add(32);
		a1.add(12);
		a1.add(69);
		
		System.out.println(a1);
		boolean b1= a1.contains(63);
		System.out.println(b1);
		Iterator<Integer> i1=a1.iterator();
		System.out.println("Iterator:   ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		//System.out.println("List Iterator:   ");
//		ListIterator<Object> i2=a1.listIterator();
//		while(i2.hasNext())
//		{
//			System.out.println(i2.next());
//		}
		//Enumeration e = a1.element();
		Queue<Integer> c1= new PriorityQueue<Integer>();//Up casting
		c1.add(63);
		c1.add(78);
		c1.add(36);
		c1.add(3);
		c1.add(12);
		//Collections.sort(c1);
		System.out.println(c1);
	}

}
