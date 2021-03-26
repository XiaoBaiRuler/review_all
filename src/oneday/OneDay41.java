package oneday;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/26 7:31
 * @Version 1.0
 */
public class OneDay41 {

    public static void main(String[] args) {
        int[] nums = {0, 5, 7, 10, 11};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0){
            return list;
        }
        int start = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            start ++;
            if (start != nums[i]){
                if (count == 1){
                    list.add(Integer.toString(start - 1));
                }
                else{
                    list.add((start - count) + "->" + nums[i - 1]);
                }
                start = nums[i];
                count = 1;
            }
            else{
               count ++;
            }
        }
        if (count != 1 && start == nums[nums.length - 1]){
            list.add((start - count + 1) + "->" + nums[nums.length - 1]);
        }
        if (count == 1 && start == nums[nums.length - 1]){
            list.add(Integer.toString(nums[nums.length - 1]));
        }
        return list;
    }
}
