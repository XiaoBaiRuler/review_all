package oneday;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/3/10 10:03
 * @Version 1.0
 */
public class OneDay20 {
    public static void main(String[] args) {
        int[] nums = {4, 4, 4};

        System.out.println(removeElement(nums, 4));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int item = 0;
        int all = nums.length;
        for (int i = 0; i < all; i++) {
            if (nums[i] == val){
                item = nums[i];
                nums[i] = nums[all - 1];
                nums[all - 1] = item;
                all --;
                if (nums[i] == val){
                    i --;
                }
            }
        }
        return all;
    }
}
