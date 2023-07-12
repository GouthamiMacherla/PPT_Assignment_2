package in.ineuron.com;

import java.util.Arrays;

public class Q1_PairSum {

	
	public static int arrayPairSum(int[] nums)
	{
		Arrays.sort(nums); //sort the array in ascending order
		int sum = 0 ;
		
		//pair the elements and add the minimum of each pair to the sum
		for(int i = 0 ; i < nums.length ; i += 2)
		{
			sum += Math.min(nums[i] , nums[ i + 1 ]);
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int[] nums = {2 , 4 , 3 , 5};
		int maxSum = arrayPairSum(nums);
		System.out.println("Maximized sum :: "  +maxSum);
		
	}

}
