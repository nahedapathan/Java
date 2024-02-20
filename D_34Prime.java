package Program.Challenge.Java;

import java.util.Scanner;

public class D_34Prime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Prime Number Checker");
		System.out.print("Please Enter your Number :");
		int num=input.nextInt();
		boolean isPrime=isPrime(num);
		if(isPrime)
		{
			System.out.println("Your Number is Prime ");
			
		}
		else
		{
			System.out.println("your Number is not Prime ");
		}

	}
	public static boolean isPrime(int num)
	{
		int i=2;
		while(i<num)
		{
			if(num%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
