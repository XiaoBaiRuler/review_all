package DoubleSix;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * @Author xiaobai
 * @Date 2021/4/5 9:19
 * @Version 1.0
 */
public class DoubleSix11 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,2, 2, 2, 2,3,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int j = 1;
        int item;
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]){
                item = nums[i];
                nums[i] = nums[j];
                nums[j] = item;
                j ++;
                flag = true;
            }
            else if (flag){
                if (nums[i] != nums[j]){
                    item = nums[i];
                    nums[i] = nums[j];
                    nums[j] = item;
                }
                j ++;
                flag = false;
            }
        }
        return j;
    }
}
