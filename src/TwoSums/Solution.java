package TwoSums;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(Integer[] nums, int target) {
        for (Integer num : nums) {
            int newtarget = target - num;
            if (Arrays.asList(nums).contains(newtarget)) {
                int[] solution = new int[2];
                solution[0] = num;
                solution[1] = newtarget;
                return solution;
            }
        }
        int[] sosekell = new int[0];
        return sosekell;
    }
}
