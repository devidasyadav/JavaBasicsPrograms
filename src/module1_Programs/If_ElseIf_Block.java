package module1_Programs;

public class If_ElseIf_Block 
{

	public static void main(String[] args) 
	{
		// if - else if
		int marks=75;
		if(marks<33)
		{
			System.out.println("You are failed");
		}
		else if(marks<=50)
		{
			System.out.println("You got grade D");
		}
		else if(marks<=60)
		{
			System.out.println("You got grade C");
		}
		else if(marks<=75)
		{
			System.out.println("You got grade B");
		}
		else if(marks<=90)
		{
			System.out.println("You got grade A");
		}
		else
		{
			System.out.println("You got grade A+");
		}

	}

}
