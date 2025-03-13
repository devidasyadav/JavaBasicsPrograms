package assignment_Programs;
import module2_Programs.StudentProperties;
public class Assignment57_OutsidePackage 
{
	//WAP on Access specifiers outside the package without becoming the subclass for methods
	public static void main(String[] args) 
	{
		StudentProperties.curiosity();//public static method
		//StudentProperties.courage();//protected static method -cannot access
		//StudentProperties.creativity(); default static method -cannot access
		//StudentProperties.respect(); private static method -cannot access
		
		StudentProperties obj=new StudentProperties();
		obj.discipline(); //public non static method
		//obj.kindness(); //protected non static method -cannot access
		//obj.persistance(); default non static method -cannot access
		//obj.motivation(); private non static method -cannot access
	}
}
