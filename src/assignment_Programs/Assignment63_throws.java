package assignment_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Assignment63_throws 
{
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException
	{
		try
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException a1)
		{
			System.out.println("InterruptedException handled");
		}
		try
		{
		FileInputStream GFG = new FileInputStream("/Desktop/GFG.txt");
		}
		catch (FileNotFoundException a2)
		{
			System.out.println("FileNotFound Exception handled");
		}
		try 
		{
		Class.forName("groTechMinds_Java\\src\\assignment_Programs\\HLI2.java");
		}
		catch (ClassNotFoundException a3)
		{
			System.out.println("ClassNotFound Exception handled");
		}
	}

}
