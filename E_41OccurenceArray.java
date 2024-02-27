import java.util.Scanner;

public class E_41OccurenceArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Array Occurence");
		System.out.print("Please enter the size of Array");
		int size=input.nextInt();
		int[] nums=new int[size];
		int i=0;
		while(i<size)
		{
			System.out.println("Please enter the element "+(i+1)+":");
			nums[i]=input.nextInt();
			i++;
		}
		System.out.print("Now Enter the Number you want to Find ");
		int num=input.nextInt();
		int occurence=noOfOccurence(nums,num);
		System.out.println("your element was found "+occurence+"times in Array");

	}
	public static int noOfOccurence(int[] nums,int num)
	{
		int occ=0;
		int i=0;
		while(i<nums.length)
		{
			if(nums[i]==num)
			{
				occ++;
			}
			i++;
		}
		return occ;
	}

}
