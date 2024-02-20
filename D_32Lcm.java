package Program.Challenge.Java;

import java.util.Scanner;

public class D_32Lcm {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Lcm");
		System.out.print("Please Enter Your Number :");
		int first=input.nextInt();
		System.out.println("Please Enter your Number :");
		int second=input.nextInt();
		int lcm=lcm(first,second);
		System.out.print("lcm of the two Number "+lcm);

	}
	public static int lcm(int first,int second)
	{
		int i=1;
		while(true)
		{
			int factor=first*i;
			if(factor%second==0)
			{
				return factor;
			}
			i++;
		}
	}

}
