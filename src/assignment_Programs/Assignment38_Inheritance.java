package assignment_Programs;
class parent_class
{
	static void home()
	{
		System.out.println("Parent property: Home");
	}
	static void farmingLand()
	{
		System.out.println("Parent property: farmingLand");
	}
}
public class Assignment38_Inheritance extends parent_class
{
	static void car()
	{
		System.out.println("Child property: Car");
	}
	public static void main(String[] args) 
	{// since child class extends (inherited) parent class it can access all its method
		car();
		home();
		farmingLand();

	}

}
