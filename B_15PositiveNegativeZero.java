package Program.Challenge.Java;

import java.util.Scanner;

public class B_15PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Number Checker\n");
		System.out.print("please enter your number");
		int num=input.nextInt();
		
		if(num>0)
		{
			System.out.println("Your number is Positive");
			
		}
		else if(num==0)
		{
			System.out.println("your Number is Zero");
			
		}
		else
		{
			System.out.println("your Number is Negative");
		}

	}

}
