package assignment_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97_ListSort 
{
	public static void main(String[] args)
	{
		List<String> l2= new ArrayList<String>();
		l2.add("Ram");
		l2.add("Sham");
		l2.add("Aditi");
		List<String> l3= new ArrayList<String>();
		l3.add("Kavya");
		l3.add("Paresh");
		l3.addAll(l2);
		l3.add(0, "Swathi");
		System.out.println("Before sorting");
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println("After sorting");
		System.out.println(l3);

	}

}
