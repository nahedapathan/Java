package Program.Challenge.Java;

import java.util.Scanner;

public class B_16OddEven {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Odd Even Calculator\n");
		System.out.print("Please Enter your Number : ");
		int num=input.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Your number is an even number");
			
		}
		else
		{
			System.out.println("Your Number is odd Number");
		}

	}

}
