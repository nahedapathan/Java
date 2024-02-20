package Program.Challenge.Java;

import java.util.Scanner;

public class C_21BitwiseAnd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Showcasing Bitwise & operator \n");
		System.out.print("Please enter the firstNumber :");
	    int first=input.nextInt();
	    System.out.println("Now Enter The Other Number :");
	    int second=input.nextInt();
	    int result=first & second;
	    System.out.println("Result is :" +result);
	}

}
