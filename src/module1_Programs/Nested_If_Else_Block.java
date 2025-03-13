package module1_Programs;

public class Nested_If_Else_Block {

	public static void main(String[] args) {
		// Nested if else
		int age = 30, weight = 57; 
		if (age > 18) 
		{
			if (weight > 50) 
			{
				System.out.println("You are eligible for blood donation");
			} 
			else 
			{
				System.out.println("You are not eligible for blood donation");
			}
		} 
		else 
		{
			System.out.println("Your are not eligible for blood donation");
		}

	}

}
