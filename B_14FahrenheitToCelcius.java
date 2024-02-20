package Program.Challenge.Java;

import java.util.Scanner;

public class B_14FahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Temperature Converter");
		System.out.print("Enter your temp in F: ");
		float fah=input.nextFloat();
		float cel=(fah-32)*5.0f/9.0f;
		System.out.println("your Temperature is: " +cel +"C");

	}

}
