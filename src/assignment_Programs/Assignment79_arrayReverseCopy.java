package assignment_Programs;

import java.util.Arrays;

public class Assignment79_arrayReverseCopy 
{//WAP to copy one array into another array in reverse order
	public static void main(String[] args)
	{		
		int rollNo[]= new int[5];
		rollNo[0]=7;
		rollNo[1]=12;
		rollNo[2]=15;
		rollNo[3]=26;
		rollNo[4]=30;
		
		System.out.println("rollNo array is : "+Arrays.toString(rollNo));
		
		int reverseRollNo[]= new int[rollNo.length];

		for(int i=0,j=rollNo.length-1;i<rollNo.length;i++,j--)
		{
			reverseRollNo[j]=rollNo[i];
		}
		System.out.println("reverseRollNo array is : "+Arrays.toString(reverseRollNo));
	}

}
