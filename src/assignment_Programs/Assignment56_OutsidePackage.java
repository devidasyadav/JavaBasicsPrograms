package assignment_Programs;

import module2_Programs.StudentProperties;

public class Assignment56_OutsidePackage extends StudentProperties
{
	// WAP on Access specifiers outside the package by becoming the subclass for methods
	public static void main(String[] args) 
	{
		curiosity();//public static method
		courage();//protected static method
		//creativity(); default static method -cannot access
		//respect(); private static method -cannot access
		Assignment56_OutsidePackage obj=new Assignment56_OutsidePackage();
		obj.discipline(); //public non static method
		obj.kindness(); //protected non static method
		//obj.persistance(); default non static method -cannot access
		//obj.motivation(); private non static method -cannot access
	}
}
