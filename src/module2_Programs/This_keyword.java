package module2_Programs;

public class This_keyword 
{
	String name;
	double salary;
	int age;
	void studentDetails(String name, double salary, int age)
	{
//		this.name=name;
//		this.age=age;
//		this.salary=salary;
		System.out.println(" Hi my name is -> "+name);
		System.out.println(" Hi my salary is -> "+salary);
		System.out.println(" Hi my age is -> "+age);
	}
	
	public static void main(String[] args) 
	{
		This_keyword obj= new This_keyword();
		obj.studentDetails("ram", 58000, 24);
		System.out.println(obj.name);
		System.out.println(obj.salary);
		System.out.println(obj.age);
	}
}
