package oneday;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/2/20 10:39
 * @Version 1.0
 */
public class OneDay05 {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.put(num, hashMap.get(num) + 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        priorityQueue.addAll(hashMap.entrySet());
        int min = 0;
        Map.Entry<Integer, Integer> item = null;
        if (!priorityQueue.isEmpty()){
            item = priorityQueue.remove();
            min = find(nums, item.getKey());
        }
        while (!priorityQueue.isEmpty() && item.getValue().equals(priorityQueue.peek().getValue())){
            int i = find(nums, priorityQueue.remove().getKey());
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    private static int find(int[] nums, int key){
        int i = 0;
        int j = nums.length - 1;
        while (nums[i] != key || nums[j] != key){
            if (nums[i] != key){
                i++;
            }
            if (nums[j] != key){
                j --;
            }
        }
        return j - i + 1;
    }
}
