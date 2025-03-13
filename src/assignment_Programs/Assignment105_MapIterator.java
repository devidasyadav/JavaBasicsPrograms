package assignment_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment105_MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m3 = new HashMap<Integer,String>();
		m3.put(11223344, "Rushabh");
		m3.put(22334455, "Priya");
		m3.put(33445566, "Richa");
		m3.put(44556677, "Ganesh");
		m3.put(55667788, "Mahesh");
		m3.put(99552288, null);
		System.out.println(m3);
		System.out.println("Printing keys and values using Iterator: ");
		Set <Entry <Integer, String>> s2=m3.entrySet();
		Iterator <Entry <Integer, String>>  i1= s2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
