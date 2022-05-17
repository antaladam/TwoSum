package TwoSums;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int newtarget = target - nums[i];
            boolean shouldi = false;
            int asd = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == newtarget && j != i) { shouldi = true; asd = j; break;}
            }
            if (shouldi) {
                int[] solution = new int[2];
                solution[0] = i;
                solution[1] = asd;
                return solution;
            }
        }
        return new int[0];
    }
}
