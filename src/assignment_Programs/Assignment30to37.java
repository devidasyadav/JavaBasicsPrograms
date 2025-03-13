package assignment_Programs;

import java.util.Scanner;

public class Assignment30to37 
{
	static final double pi=Math.PI;
	static void SquareArea(double a)
	{
		double Area_Square= a*a;
		System.out.println("Area of square with side "+a+" is "+Area_Square);
	}
	static void SquareCircumf(double a)
	{
		double Circum_Square=4*a;
		System.out.println("Area of square with side "+a+" is "+Circum_Square);
	}
	static void RectangleArea(double l, double b)
	{
		double Area_Rectangle= l*b;
		System.out.println("Area of Rectangle is "+Area_Rectangle);

	}
	static void RectangleCircumf(double l, double b)
	{
		double Circum_Rectangle=2*(l+b);
		System.out.println("Circumference of Rectangle is "+Circum_Rectangle);
	}
	static void CircleArea(double r)
	{
		double Area_Circle= pi*r*r;
		System.out.println("Area of Circle is "+Area_Circle);

	}
	static void CircleCircumf(double r)
	{
		double Circum_Circle=2*pi*r;
		System.out.println("Circumference of Circle is "+Circum_Circle);
	}
	static void TriangleArea(double base, double height)
	{
		double Area_Triangle= (base*height)/2;
		System.out.println("Area of triangle is "+Area_Triangle);
	}
	static void TriangleCircumf(double x, double y, double z)
	{
		double Circum_Triangle= x+y+z;
		System.out.println("Circumference of triangle is "+Circum_Triangle);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		// Prompt the user to enter Square side
		System.out.print("Enter side of square: ");
		double a = s.nextDouble();
		SquareArea(a);
		SquareCircumf(a);
		// Prompt the user to enter Rectangle sides
		System.out.print("Enter length of rectangle: ");
		double l = s.nextDouble();
		System.out.print("Enter breadth of rectangle: ");
		double b = s.nextDouble();
		RectangleArea(l, b);
		RectangleCircumf(l, b);
		// Prompt the user to enter circle radius
		System.out.print("Enter enter circle radius: ");
		double r = s.nextDouble();
		CircleArea(r);
		CircleCircumf(r);
		// Prompt the user to triangle details
		System.out.print("Enter base of triangle: ");
		double base = s.nextDouble();
		System.out.print("Enter height of triangle: ");
		double height = s.nextDouble();
		TriangleArea(base, height);
		System.out.print("Enter first side of triangle, x: ");
		double x = s.nextDouble();
		System.out.print("Enter second side of triangle, y: ");
		double y = s.nextDouble();
		System.out.print("Enter third side of triangle, z: ");
		double z = s.nextDouble();
		TriangleCircumf(x, y, z);
		s.close();
	}

}
