package assignment_Programs;

import java.util.HashMap;
import java.util.Map;

public class Assignment99_MapMethods 
{//WAP on MAP concepts using its methods
public static void main(String[] args) 
{
	Map<Integer,String> m2 = new HashMap<Integer,String>();
	m2.put(11223344, "Rushabh");
	m2.put(22334455, "Priya");
	m2.put(33445566, "Richa");
	m2.put(44556677, "Ganesh");
	m2.put(55667788, "Mahesh");
	System.out.println(m2);
	m2.remove(11223344);
	System.out.println(m2);
	m2.put(66223344, "Rishabh");
	m2.put(77223344, "shabanam");
	System.out.println(m2);
	m2.remove(33445566, "Richa");
	m2.replace(22334455, "Priya Gupta");
	m2.replace(55667788, "Mahesh", "MaheshYadav");
	System.out.println(m2);
	
	m2.clear();
	System.out.println(m2.isEmpty());
}
}
