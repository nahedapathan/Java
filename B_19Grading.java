package Program.Challenge.Java;

import java.util.Scanner;

public class B_19Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner input=new Scanner(System.in);
           System.out.println("Welcome to Grade Calculator\n");
           System.out.print("Please enter your Percentage :");
           float percentage=input.nextFloat();
           if(percentage>=90)
           {
        	   System.out.println("Great ,you have got A");
           }
           else if(percentage>=75)
           {
        	   System.out.println("Good ,you have got B");
           }
           else if(percentage>=60)
           {
        	   System.out.println("You  have got C ,Work Harder Next Time");
           }
           else if(percentage>=30)
           {
        	   System.out.println("You have got D ,You Seriously need to work harder");
           }
           else
           {
        	   System.out.println("You have failed the test & got F");
           }
	}

}
