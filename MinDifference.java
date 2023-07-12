package in.ineuron.com;

import java.util.Arrays;

public class MinDifference {
    public static int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        
        // Sort the array in ascending order
        Arrays.sort(nums);

        // Calculate the initial score
        int initialScore = nums[n - 1] - nums[0];

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            int minVal = Math.min(nums[0] + k, nums[i + 1] - k);
            int maxVal = Math.max(nums[n - 1] - k, nums[i] + k);
            initialScore = Math.min(initialScore, maxVal - minVal);
        }

        return initialScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int result = minimumDifference(nums, k);
        System.out.println("The minimum difference of given array is :: " +result);
    }
}
