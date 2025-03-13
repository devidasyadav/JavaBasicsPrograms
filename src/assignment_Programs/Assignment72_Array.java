package assignment_Programs;

public class Assignment72_Array 
{
	public static void main(String[] args) 
	{
		// WAP on basic concepts of Array // try catch for ArrayOutOfBoundsException
		int rollNo [] = new int[5];
		String Names [] = new String[5];
		try
		{
		rollNo[0] = 1;
		rollNo[1] = 2;
		rollNo[2] = 3;
		rollNo[3] = 4;
		rollNo[4] = 5;
		
		Names[0] = "Devidas"; 
		Names[1] = "Manish";
		Names[2] = "Naresh";
		Names[3] = "Suresh";
		Names[4] = "Samay";
		rollNo[5] = 6;
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Handled ArrayIndexOutOfBounds Exception");
		}
		for(int i= 0; i<=4; i++)
		{
			System.out.println("Roll number : "+rollNo[i]+" Name : "+Names[i]);
		}
	}

}
