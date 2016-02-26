/*************************************************************************************************
 * CSC 8000
 * Geometry1.Java
 * Purpose: To demonstrate the basic geometry operations.
 * @author Naresh Nelavalli
 * @version 1.0 
 * @Date 8/31/2015
 *
 */
//***********************************************************************************************
import java.util.Random;

public class Geometry1 {
	final double pi = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		final int maximum = 100;
		final int minimum = 10;
		
		int n = maximum - minimum + 1;
		int ran = random.nextInt(n) + minimum;
		System.out.println("the value of random number is :" + ran);
		
		double var1 = ran + 10.22;
		double var2 = ran + 11.01;
		double var3 = ran + 12.212;
		
		Geometry1 G1 = new Geometry1();
		G1.SquareArea(var1);
		G1.SquarePerimeter(var1);
		G1.RectArea(var1, var2);
		G1.RectPerimeter(var1, var2);
		G1.CircleArea(var1);
		G1.CirclePerimeter(var1);
		G1.CircleDiameter(var1);
		G1.TriangleArea(var1, var2);
		G1.TrianglePerimeter(var1, var2, var3);
		G1.RightTriangle(var1, var2);
		G1.CylinderSurfaceArea(var1, var2);
		G1.CylinderVolume(var1, var2);
		G1.SphereSurfaceArea(var1);
		G1.SphereVolume(var1);
		

	}
	public double SquareArea(double side)
	{
		double Area = side * side ;
		System.out.println("The Area of Square is : " + Area);
		return Area;
	}
	public double SquarePerimeter(double side)
	{
		double Perimeter = 4 * side;
		System.out.println("The Perimeter of Square is : " + Perimeter);
		return Perimeter;
	}
	
	public double RectArea(double length, double width)
	{
		double Area = length * width;
		System.out.println("The Area of Rectangle is : " + Area);
		return Area;
	}
	public double RectPerimeter(double length,double width)
	{
		double perimeter = 2 *(length + width);
		System.out.println("The Perimeter of Rectangle is : " + perimeter);
		return perimeter;
	}
	
	public double CircleArea(double radius)
	{
		double Area = pi * radius * radius;
		System.out.println("The Area of Rectangle is : " + Area);
		return Area;
	}
	

	public double CirclePerimeter(double radius)
	{
		double perimeter = 2 * pi * radius;
		System.out.println("The Perimeter of circle is : " + perimeter);
		return perimeter;
	}
	
	public double CircleDiameter(double radius)
	{
		double diameter = 2 * radius;
		System.out.println("The Diameter of circle is : " + diameter);
		return diameter;
	}
	
	public double TriangleArea(double base,double height)
	{
		double Area = 0.5 * base * height;
		System.out.println("The Area of Triange is : " + Area);
		return Area;
	}
	public double TrianglePerimeter(double side1, double side2, double side3)
	{
		double perimeter = side1 + side2 + side3;
		System.out.println("The Perimeter of Triangle is : " + perimeter);
		return perimeter;
	}
	public double RightTriangle(double side1, double side2)
	{
		double hypo = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2)) ;
		System.out.println("The Hypotenuse  of RightTriangle is : " + hypo);
		return hypo;
	}
	public double CylinderVolume(double radius, double height)
	{
		double volume = pi * radius * radius * height;
		System.out.println("The volume of cylinder is : " + volume);
		return volume;
	}
	public double CylinderSurfaceArea(double radius,double height)
	{
		double Area = 2*pi* radius *(radius + height);
		System.out.println("The Area of Cylinder is : " + Area);
		return Area;
	}
	
	public double SphereVolume(double radius)
	{
		double volume = (4/3)* pi * radius * radius * radius;
		System.out.println("The volume of cylinder is : " + volume);
		return volume;
	}
	public double SphereSurfaceArea(double radius)
	{
		double Area = 4*pi* radius *radius;
		System.out.println("The Area of Cylinder is : " + Area);
		return Area;
	}
	
	
	
	
}
