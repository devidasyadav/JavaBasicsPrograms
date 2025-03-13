package module3_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProperty 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m1= new HashMap<Integer,String>();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter account number");
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter Name of account holder");
		m1.put(s1.nextInt(), s2.next());
		System.out.println(m1);
		s1.close();
		s2.close();
	}

}
