package assignment_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment104_KeysValues 
{//WAP to fetch both keys&values present in map
	public static void main(String[] args) 
	{
		Map<Integer,String> m3 = new HashMap<Integer,String>();
		m3.put(11223344, "Rushabh");
		m3.put(22334455, "Priya");
		m3.put(33445566, "Richa");
		m3.put(44556677, "Ganesh");
		m3.put(55667788, "Mahesh");
		m3.put(99552288, null);
		System.out.println(m3);
		System.out.println("Printing keys and values using entrySet() : ");
		for ( Entry<Integer, String> bankDetails : m3.entrySet())
		{
			System.out.println(bankDetails);
		}
		
	}

}
