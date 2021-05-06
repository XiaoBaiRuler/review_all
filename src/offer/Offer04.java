package offer;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/5/5 9:00
 * @Version 1.0
 */
public class Offer04 {
    public static void main(String[] args) {
        int[] nums = {45,46,67,73,74,74,77,83,89,98};
        System.out.println(Arrays.toString(twoSum(nums, 148)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int i = nums.length - 1;
        int j = nums.length - 1;
        int[] result = new int[2];
        for (; i >= 0; i--) {
            if (nums[i] >= target){
                j = i;
            }
            else if (nums[i] == (target >> 1)){
                if ((nums[i-1] + nums[i]) == target){
                    result[0] = nums[i - 1];
                    result[1] = nums[i];
                    return result;
                }
                if ((nums[i] + nums[i + 1]) == target){
                    result[0] = nums[i + 1];
                    result[1] = nums[i];
                    return result;
                }
            }
            else if (nums[i] < (target >> 1)){
                break;
            }
        }
        if (j == nums.length - 1){
            j = nums.length;
        }
        int re = 0;
        for (int k = i + 1; k < j; k++) {
            re = search(nums, i,target - nums[k]);
            if (re != 0){
                result[0] = nums[k];
                result[1] = re;
                return result;
            }
        }
        return result;
    }

    private static int search(int[] nums, int j, int s) {
        int i = 0;
        int center;
        while (i <= j){
            center = (i + j) >> 1;
            if (nums[center] == s){
                return nums[center];
            }
            else if (nums[center] > s){
                j = center - 1;
            }
            else{
                i = center + 1;
            }
        }
        return 0;
    }
}
