package DoubleSix;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/31 21:00
 * @Version 1.0
 */
public class DoubleSix04 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 6, 7, 5, 8, 8};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = - Math.abs(nums[Math.abs(nums[i])- 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }
}
