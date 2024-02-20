package Program.Challenge.Java;

import java.util.Scanner;

public class C_24BitwiseCompliment {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to shocase of Not / compliment Operator \n");
		System.out.print("Please Enter your Number ");
		int num=input.nextInt();
		int result= ~num;
		System.out.println("your Result is :"+result);
		

	}

}
