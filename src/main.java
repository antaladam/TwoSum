import TwoSums.Solution;
import TwoSums.Solution2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] tesztadat = {3,2,4};
        int cel = 6;
        Solution szolver = new Solution();
        System.out.println(Arrays.toString(szolver.twoSum(tesztadat, cel)));

        Solution2 asdf = new Solution2();
        System.out.println(Arrays.toString(asdf.twoSum(tesztadat, cel)));
    }
}
