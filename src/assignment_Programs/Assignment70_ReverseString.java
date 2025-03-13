package assignment_Programs;

public class Assignment70_ReverseString
{

	public static void main(String[] args) 
	{
		// WAP to reverse a string
		String input = "Devidas Yadav";
		String reverseString = "";
		for(int i=input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			reverseString = reverseString+c1;
		}
		System.out.println(reverseString);
	}

}
