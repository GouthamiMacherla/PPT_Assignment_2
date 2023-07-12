package in.ineuron.com;

import java.util.HashMap;
import java.util.Map;

public class HarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        // Create a frequency map to count the occurrences of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int longestSubsequence = 0;

        // Iterate through the frequency map
        for (int num : freqMap.keySet()) {
            if (freqMap.containsKey(num + 1)) {
                // Calculate the length of the harmonious subsequence
                int currentLength = freqMap.get(num) + freqMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, currentLength);
            }
        }

        return longestSubsequence;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println( "The Longest Harmonious Subsequence number :: " +result);
    }
}
