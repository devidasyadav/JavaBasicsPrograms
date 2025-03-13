package assignment_Programs;

public class Assignment116_ClassTypeCasting 
{//WAP on Class Type casting to achieve Up casting(in implicit and explicit way) and Downcasting
	public static void main(String[] args) 
	{
		//Up casting implicit syntax
		Object o1= new Assignment116_ClassTypeCasting();

		//Up casting explicit syntax
		Object o2= (Object)new Assignment116_ClassTypeCasting();
		
		//Down casting in explicit manner
		Assignment116_ClassTypeCasting dc1= (Assignment116_ClassTypeCasting) o2;
		
	}

}
