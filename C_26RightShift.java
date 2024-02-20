package Program.Challenge.Java;

import java.util.Scanner;

public class C_26RightShift {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Showcase RightShift");
		System.out.print("Please enter your Number : ");
		int num=input.nextInt();
		int result=num>>1;
		System.out.println("Your Result is :" +result);

	}

}
