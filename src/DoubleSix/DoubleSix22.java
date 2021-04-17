package DoubleSix;

import sun.misc.LRUCache;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/4/16 10:46
 * @Version 1.0
 */
public class DoubleSix22 {

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findMissingRanges(nums, 22, 22));
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0){
            if (lower == upper){
                list.add("" + lower);
            }
            else{
                list.add(lower + "->" + upper);
            }
            return list;
        }
        for (int num : nums) {
             if (num != lower)
            {
                if ((lower + 1) == num) {
                    list.add("" + lower);
                } else {
                    list.add(lower + "->" + (num - 1));
                }
                lower = num;
            }
             lower ++;
        }
        if (nums[nums.length - 1] < upper){
            if ((nums[nums.length - 1] + 1) == upper){
                list.add("" + upper);
            }
            else{
                list.add((nums[nums.length - 1] + 1) + "->" + upper);
            }
        }
        return list;
    }
}