package Program.Challenge.Java;

import java.util.Scanner;

public class B_20AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input=new Scanner(System.in);
          System.out.println("Please Enter Your Age :");
          int age=input.nextInt();
          if(age>=65)
          {
        	  System.out.println("You are Senior Citizen");
          }
          else if(age>=20)
          {
        	  System.out.println("You are an Adult");
          }
          else if(age>=13)
          {
        	  System.out.println("You are a Teenager");
          }
          else
          {
        	  System.out.println("you are Child");
          }
	}

}
