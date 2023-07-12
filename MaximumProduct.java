package in.ineuron.com;

import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int length = nums.length;
        
        // Calculate the product of the three largest numbers
        int product1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
        
        // Calculate the product of the two smallest numbers and the largest number
        int product2 = nums[0] * nums[1] * nums[length - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = maximumProduct(nums);
        System.out.println("The maximum product of the given array numbers is :: " +result);
    }
}
