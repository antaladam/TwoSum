package TwoSums;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = (nums.length - 1); j > 0; j--){
                if ((nums[i] + nums[j]) == target && i != j){
                    int[] answer = new int[2];
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return new int[0];
    }
}
