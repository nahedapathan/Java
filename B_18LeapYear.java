package Program.Challenge.Java;

import java.util.Scanner;

public class B_18LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to New Year Calculator");
         System.out.print("Please Enter the year that you Want to Check: ");
         int year=input.nextInt();
         if(year%400==0 || (year%4==0  && year%100!=0))
         {
        	 System.out.println("Your year is a leap Year");
         }
         else
         {
        	 System.out.println("Your year is not a Leap Year");
         }
         
	}

}
