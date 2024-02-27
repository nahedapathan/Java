import java.util.Scanner;

public class E_40ArraySumAverage {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Array Sum & Average");
		System.out.print("Please Enter the number of Element");
		int size=input.nextInt();
		int[] nums=new int[size];
		int i=0;
		while(i<size)
		{
			System.out.print("please enter element no"+(i+1)+":");
			nums[i]=input.nextInt();
			i++;
		}
		long sum=sum(nums);
		int avg=average(nums);
		System.out.println("Sum of the number is :"+sum);
		System.out.println("Average of the number :"+avg);

	}
	public static long sum(int[] nums)
	{
		long sum=0;
		int i=0;
		while(i<nums.length)
		{
			sum+=nums[i];
			i++;
		}
		return sum;
	}
	public static int average(int[] nums)
	{
		long sum=sum(nums);
		return (int)(sum/nums.length);
	}

}
