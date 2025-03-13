package assignment_Programs;

public class Assignment75_ArrayAvg 
{//Find out the average of all the numbers presnet in your array
	public static void main(String[] args)
	{
		double empSalary[]= new double[5];
		empSalary[0]=7.48;
		empSalary[1]=12.3;
		empSalary[2]=15.6;
		empSalary[3]=26.4;
		empSalary[4]=30.9;
		
		double sum=0.0; 
		for(int i=0;i<empSalary.length;i++)
		{
			sum=sum+empSalary[i];
		}
		double avgSalary=sum/empSalary.length;
		System.out.println("Avg salary of emp is : "+avgSalary+" Lakhs");
	}
}
