package assignment_Programs;

public class Assignment55_WithinPackage 
{
	public static void main(String[] args) 
	{
		Teacher.method1();
		Teacher.method2();
		Teacher.method3();
		//Teacher.method4(); we cannot access private method in different class but same package
		System.out.println("======================");
		Assignment54_AccessSpecifier obj = new Assignment54_AccessSpecifier();
		obj.add1();
		obj.sub1();
		obj.mult1();
		//obj.div1(); we cannot access private method in different class but same package
	}
}
