package Program.Challenge.Java;

import java.util.Scanner;

public class C_27OddEvenBitwise {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Odd Even Calculator ");
		System.out.print("Please enter your Number ");
		int num=input.nextInt();
		if((num&1)==1)
		{
			System.out.print("Your Number is Odd");
		}
		else
		{
			System.out.print("your Number is Even");
		}

	}

}
