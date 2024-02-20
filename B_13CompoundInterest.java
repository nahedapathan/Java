package Program.Challenge.Java;

import java.util.Scanner;

public class B_13CompoundInterest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to compound interest calculator\n");
		System.out.print("Please enteryour principle amount Rs: ");
		int principle=input.nextInt();
		System.out.println("Now, me your rate of interest: ");
		float rate=input.nextFloat();
		System.out.print("Now , tell me for how many years are you borrowingthis money: ");
		float years=input.nextFloat();
		
		double compInt=principle* Math.pow((1+rate/100), years);
		System.out.println("Your compound interest is Rs : "+compInt);

	}

}
