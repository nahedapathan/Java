package Program.Challenge.Java;

import java.util.Scanner;

public class B_17GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner input=new Scanner(System.in);
          System.out.println("Welcome to the world Three");
          System.out.println("Please enter the first number:");
          int first=input.nextInt();
          System.out.println("Now, Enter your Second Number");
          int second=input.nextInt();
          System.out.println("Finally ,Enter your Third Number");
          int third=input.nextInt();
          if(first>=second && first>=third)
          {
        	  System.out.println(first+"is the greatest number");
        	  
          }
          else if(second>=third)
          {
        	  System.out.println(second+" is the greatest Number");
        	  
          }
          else
          {
        	  System.out.println(third+"is the greatest Number");
          }
          
	}

}
