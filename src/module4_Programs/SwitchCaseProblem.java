package module4_Programs;

import java.util.Scanner;

public class SwitchCaseProblem 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter which brower you want to launch:1-Chrome,2-firefox,3-edge,4-safari");
		switch(s1.nextInt())
		{
		case 1: System.out.println("Launched Chrome Browser");
				break;
		case 2: System.out.println("Launched FireFox Browser");
				break;
		case 3: System.out.println("Launched Edge Browser");
				break;
		case 4: System.out.println("Launched Safari Browser");
				break;
		default: System.out.println("No valid input: enter 1,2,3 or 4 only");
			
		}
		s1.close();
	}

}
