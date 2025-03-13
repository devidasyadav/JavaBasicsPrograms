package module2_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		// WAP to reverse string
		String input = "mom";
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
		//input.toCh
	}

}
