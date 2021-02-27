package oneday;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author xiaobai
 * @Date 2021/2/22 10:34
 * @Version 1.0
 */
public class OneDay06 {
    //https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
    public static void main(String[] args) {
        int[] nums1 = {8, 2, 4, 7};
        int[] nums2 = {10, 1, 2, 4, 7, 2};
        System.out.println(longestSubarray(nums2, 5));
    }

    public static int longestSubarray(int[] nums, int limit) {

        int left = 0;
        int result = 0;
        PriorityQueue<Pair<Integer, Integer>> max = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        PriorityQueue<Pair<Integer, Integer>> min = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));

        for (int i = 0; i < nums.length; i++) {

            max.add(new Pair<>(nums[i], i));
            min.add(new Pair<>(nums[i], i));

            assert max.peek() != null;
            Pair<Integer, Integer> maxItem = max.peek();
            assert min.peek() != null;
            Pair<Integer, Integer> minItem = min.peek();
            if (Math.abs(nums[i] - maxItem.getKey()) > limit){
                if (i - maxItem.getValue() > result){
                    result = i - maxItem.getValue();
                }
                if (nums[left] == maxItem.getKey()){
                    max.remove();
                }
            }
            if (Math.abs(nums[i] - minItem.getKey()) > limit){
                if (i - minItem.getValue() > result){
                    result = i - minItem.getValue();
                }
                if (nums[left] == minItem.getKey()){
                    min.remove();
                }
            }
        }

        return result;
    }
}
