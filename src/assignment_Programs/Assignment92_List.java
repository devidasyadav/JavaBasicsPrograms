package assignment_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment92_List 
{//"WAP on List concepts using its methods
	public static void main(String[] args) 
	{
		List<Object> l1= new ArrayList<Object>();
		l1.add(52);
		l1.add(524545);
		l1.add(8.60);
		l1.add(true);
		l1.add("ram");
		l1.add('A');
		l1.add(8.60);
		l1.add(8.60);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
		List<String> l2= new ArrayList<String>();
		l2.add("Ram");
		l2.add("Sham");
		l2.add("Aditi");
		List<String> l3= new ArrayList<String>();
		l3.add("Kavya");
		l3.add("Paresh");
		l3.addAll(l2);
		System.out.println(l3);
		l3.add(0, "Swathi");
		Collections.sort(l3);
		System.out.println(l3);
		System.out.println(l3.containsAll(l2));
		System.out.println(l3.contains("Kavya"));
		System.out.println(l3.isEmpty());
		System.out.println(l3.indexOf("Paresh"));
	}

}
