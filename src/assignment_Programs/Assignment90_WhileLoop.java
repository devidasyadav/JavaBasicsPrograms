package assignment_Programs;

public class Assignment90_WhileLoop 
{
	public static void main(String[] args) 
	{
		int i=1, sum=0;
		while(i<=10)
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of first ten numbers: "+sum);
	}

}
