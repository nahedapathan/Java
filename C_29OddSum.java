package Program.Challenge.Java;

import java.util.Scanner;

public class C_29OddSum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Odd Sum");
		System.out.println("Please Enter your Number :");
		int num=input.nextInt();
		int sum=OddSum(num);
		System.out.println("OddSum till"+num+ "is :" +sum);

	}
	public static int OddSum(int num)
	{
		int sum=0;
		int i=1;
		while(i<=num)
		{
			sum+=i;
			i+=2;
		}
		return sum;
	}

}
