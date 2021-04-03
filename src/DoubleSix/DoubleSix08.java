package DoubleSix;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author xiaobai
 * @Date 2021/4/2 12:48
 * @Version 1.0
 */
public class DoubleSix08 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        for (; i > 0; i--) {
            if (nums[i - 1] < nums[i]){
                break;
            }
        }
        i -= 1;
        if (i < 0){
            reverse(nums, 0);
        }
        else{
            int j = nums.length - 1;
            for (; j >= 0; j--) {
                if (nums[j] > nums[i]){
                    break;
                }
            }
            int item = 0;
            item = nums[j];
            nums[j] = nums[i];
            nums[i] = item;
            reverse(nums, i + 1);
        }

    }
    private static void reverse(int[] nums, int k){
        int i = (nums.length - 1 + k) >> 1;
        int item = 0;
        int m = 0;
        for (int j = k; j <= i; j++) {
            item = nums[j];
            nums[j] = nums[nums.length - 1 - m];
            nums[nums.length - 1 - m] = item;
            m ++;
        }
    }
}
