package Program.Challenge.Java;

import java.util.Scanner;

public class B_11PerimeterTriangle {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Area Calculator\n");
		System.out.println("Please Enter your base in cms :");
		double base=input.nextDouble();
		System.out.println("Now,Enter your Perpendicular height:");
		double height=input.nextDouble();
		
		double area=(base*height)/2;
		System.out.println("the area of your triangle is : "+area);
		
	}

}
