package assignment_Programs;

public class Assignment61_ExecptionHandling 
{
	public static void main(String[] args) 
	{
		//WAP on Exception handling
		try
		{ //if flag true- ArithmeticException, flag false=NullPointerException
			boolean flag=false;
			if(flag)
			{
			int a=1/0;
			}
			else
			{
			String str = null;
			str.length();
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception has been handled"+ ae.getMessage());
			
		}
		catch(NullPointerException np1)
		{
			System.out.println("NullPointer Exception has been handled"+ np1.getMessage());
		}
	}

}
