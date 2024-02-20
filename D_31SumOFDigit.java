package Program.Challenge.Java;

import java.util.Scanner;

public class D_31SumOFDigit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Sum OF Digit :");
		System.out.print("Please Enter Your Number : ");
		int num=input.nextInt();
		int sum=SumOfDigit(num);
		System.out.print("Sum Of Digit"+sum);
		

	}
	
	public static int SumOfDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}

}
