package Program.Challenge.Java;

import java.util.Scanner;

public class C_22BtwiseOr {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter the First Number :");
		int first=input.nextInt();
		System.out.print("Now Enter the Other Numbeer :");
		int second=input.nextInt();
		int result=first | second;
		System.out.println("Result is : "+result);

	}

}
