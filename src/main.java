import TwoSums.Solution;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Integer[] tesztadat = {2,7,11,15};
        int cel = 9;
        Solution szolver = new Solution();
        System.out.println(Arrays.toString(szolver.twoSum(tesztadat, cel)));
    }
}
