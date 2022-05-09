package TwoSums;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(Integer[] nums, int target) {
        for (Integer num : nums) {
            if (Arrays.asList(nums).contains(target - num)) {
                int[] solution = new int[2];
                solution[0] = num;
                solution[1] = target - num;
                return solution;
            }
        }
        return new int[0];
    }
}
