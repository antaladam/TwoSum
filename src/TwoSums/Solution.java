package TwoSums;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(Integer[] nums, int target) {
        int[] solution = new int[2];
        for (Integer num : nums) {
            int newtarget = target - num;
            if (Arrays.asList(nums).contains(newtarget)) {
                solution[0] = num;
                solution[1] = newtarget;
                break;
            }
        }
        return solution;
    }
}
