package Program.Challenge.Java;

import java.util.Scanner;

public class C_28MultiplicationTable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Multiplication World \n");
		System.out.print("Please Enter your Number");
		int num=input.nextInt();
		printMultiplicationTable(num);
		

	}
	public static void printMultiplicationTable(int num)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(num+"x"+i+"="+(num*i));
			i++;
			
		}
	}
	
}
