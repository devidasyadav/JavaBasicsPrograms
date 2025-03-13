package assignment_Programs;

import java.util.Arrays;

public class Assignment78_copyArray 
{//WAP to copy one array into another array
	public static void main(String[] args) 
	{	
		double empPayrollSalary[]= new double[5];
		empPayrollSalary[0]=7.48;
		empPayrollSalary[1]=12.3;
		empPayrollSalary[2]=15.6;
		empPayrollSalary[3]=26.4;
		empPayrollSalary[4]=30.9;
		
		System.out.println("employee payroll salary is : "+Arrays.toString(empPayrollSalary));
		double empThirdPartySalary[]= new double[empPayrollSalary.length];

		for(int i=0;i<empPayrollSalary.length;i++)
		{
			empThirdPartySalary[i]=empPayrollSalary[i];
		}
		System.out.println("employee cpoied third party salary is : "+Arrays.toString(empThirdPartySalary));
		
	}

}
