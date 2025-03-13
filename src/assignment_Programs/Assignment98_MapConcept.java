package assignment_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment98_MapConcept 
{/*WAP to store account number, account holder name inside Map
	by passing the values at runtime for both account number, account holder*/
	
	public static void main(String[] args) 
	{
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		Scanner s1= new Scanner(System.in);
		int a=1;
		while(a==1)
		{
			System.out.println("Enter account number: ");
			int accountNo=s1.nextInt();
			System.out.println("Enter name of account holder: ");
			String Name=s1.next();
			m1.put(accountNo, Name);
			System.out.println("Do you want to enter data again if yes (enter) 1 else 0: ");
			a=s1.nextInt();
		}
		System.out.println(m1);
		s1.close();
		Map<Integer,String> m2 = new HashMap<Integer,String>();
		m2.put(11223344, "Rushabh");
		m2.put(22334455, "Priya");
		m2.put(33445566, "Richa");
		m2.put(44556677, "Ganesh");
		m2.put(55667788, "Mahesh");
		System.out.println(m2);
		m2.putAll(m1);
		System.out.println(m2);
		
	}

}
