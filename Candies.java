package in.ineuron.com;

import java.util.HashSet;
import java.util.Set;

public class Candies {
    public static int maxDifferentCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        int n = candyType.length;

        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        return Math.min(uniqueCandies.size(), n / 2);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int result = maxDifferentCandies(candyType);
        System.out.println("The number  of candies Alice can eat are ::" +result);
    }
}
