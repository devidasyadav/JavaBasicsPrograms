package assignment_Programs;

import java.util.HashMap;
import java.util.Map;

public class Assignment101_MapMethods2
{//"WAP on MAP using methods like get(), containsKey(), containsValue(), putIfAbsent(), equals()"
	public static void main(String[] args)
	{
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(11223344, "Rushabh");
		m2.put(22334455, "Priya");
		m2.put(33445566, "Richa");
		m2.put(44556677, "Ganesh");
		m2.put(55667788, "Mahesh");
		m2.put(99552288, null);
		System.out.println(m2);
		System.out.println(m2.get(22334455));
		System.out.println(m2.containsKey(44556677));
		System.out.println(m2.containsKey(445566377));
		System.out.println(m2.containsValue("Ganesh"));
		System.out.println(m2.containsValue("Devidas"));
		m2.putIfAbsent(99552288, "Yadav");
		System.out.println(m2);
		
		Map<Integer,String> m3 = new HashMap<Integer,String>();
		m3.put(11223344, "Rushabh");
		m3.put(22334455, "Priya");
		m3.put(33445566, "Richa");
		m3.put(44556677, "Ganesh");
		m3.put(55667788, "Mahesh");
		m3.put(99552288, null);
		System.out.println(m3);
		System.out.println(m2.equals(m3));
		
	}

}
