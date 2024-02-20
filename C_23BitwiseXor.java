package Program.Challenge.Java;

import java.util.Scanner;

public class C_23BitwiseXor {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Shocasing bitwise xor operation");
		System.out.print("Please Enter the first NNumber :");
		int first=input.nextInt();
		System.out.print("Now Enter the other NUmber :");
		int second=input.nextInt();
		int result=first^second;
		System.out.print("Result is "+result);
	}

}
