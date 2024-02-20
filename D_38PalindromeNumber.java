package Program.Challenge.Java;

import java.util.Scanner;

public class D_38PalindromeNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("welcome to Palindrome :");
		System.out.print("Please Enter your Number :");
		int num=input.nextInt();
		boolean ispalindrome=isPalindrome(num);
		if(ispalindrome)
		{
			System.out.println("your number is palindrome ");
			
		}
		else
		{
			System.out.println("your number is not Palindrome");
		}

		
	}
	public static boolean isPalindrome(int num)
	{
		return num==reverse(num);
	}
	
	public static int reverse(int num)
	{
		int newNum=0;
		while(num>0)
		{
			int digit=num%10;
			newNum=newNum*10+digit;
			num/=10;
		}
		return newNum;
	}

}
