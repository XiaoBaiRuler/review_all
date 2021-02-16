package oneday;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/16 10:26
 * @Version 1.0
 */
public class OneDay02 {
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                max += nums[i];
            }
        }
        return max;
    }
}
