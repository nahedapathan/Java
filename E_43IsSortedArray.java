import java.util.Scanner;

public class E_43IsSortedArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Array Sorting Check post \n");
		System.out.print("Please Enter the Size of Array");
		int size=input.nextInt();
		int[] nums=new int[size];
		int i=0;
		while(i<size)
		{
			System.out.println("Please Enter the element"+(i+1)+":");
			nums[i]=input.nextInt();
			i++;
		}
		boolean isInc=isIncreasing(nums);
		boolean isDec=isDecreasing(nums);
		if(isInc || isDec)
		{
			System.out.print("Your Array is Sorted ");
		}
		else
		{
			System.out.print("your Array is not Sorted");
		}

		
	}
	public static boolean isIncreasing(int[] nums)
	{
		int i=1;
		while(i<nums.length)
		{
			if(nums[i]<nums[i-1])
			{
				return false;
				
			}
			i++;
		}
		return true;
	}
	public static boolean isDecreasing(int[] nums)
	{
		int i=1;
		while(i<nums.length)
		{
			if(nums[i] >nums[i-1])
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
