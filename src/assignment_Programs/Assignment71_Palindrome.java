package assignment_Programs;

public class Assignment71_Palindrome {

	public static void main(String[] args) {
		// WAP to check if the given string is a Palindrome ?
		String input = "saippuakivikauppias";
		String reverseString = "";
		for(int i=input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			reverseString = reverseString+c1;
		}
		System.out.println(reverseString);
		
		if(input.equals(reverseString)) 
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
