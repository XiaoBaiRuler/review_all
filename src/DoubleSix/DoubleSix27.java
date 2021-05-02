package DoubleSix;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/4/30 10:30
 * @Version 1.0
 */
public class DoubleSix27 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3, 2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        // 线性时间复杂度是什么？
        // 不使用额外空间，常数空间算不算？
        Arrays.sort(nums);
        int j = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == j){
                count ++;
            }
            else if (count != 0){
                j = nums[i];
                count = 0;
            }
            else {
                return j;
            }
        }
        return j;
    }
}
