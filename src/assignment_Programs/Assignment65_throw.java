package assignment_Programs;

import java.util.InputMismatchException;

public class Assignment65_throw 
{
	public static void main(String[] args) throws NullPointerException,InputMismatchException
	{
		if (1>3)
		{
			throw new NullPointerException();	
			//throw new InputMismatchException(); unreachable code
		}
		else
		{
			throw new InputMismatchException(); //dead code
		}
		
	}

}
