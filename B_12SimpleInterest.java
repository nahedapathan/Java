package Program.Challenge.Java;

import java.util.Scanner;

public class B_12SimpleInterest {

	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Welcome to Simple Interest Calculator \n");
	   System.out.print("Please enter your principle amount Rs:");
	   int principle=input.nextInt();
	   System.out.print("Now, Tell me your rate of interest: ");
	   float rate=input.nextFloat();
	   
	   System.out.print("Now, tell me for how many yers are you borrowing this money: ");
	   float years=input.nextFloat();
	   
	   float interest=(principle *rate * years)/100;
	   
	   System.out.println("\n\n Your Simple interest is Rs : "+interest);
	   

	}

}
