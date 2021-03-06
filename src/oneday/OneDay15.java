package oneday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author xiaobai
 * @Date 2021/3/6 9:24
 * @Version 1.0
 */
public class OneDay15 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    /**
     * 这个循环数组描述错了: 玄学的循环
     * @param nums nums
     * @return int[]
     */
    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length == 0){
            return result;
        }
        int max = nums[0];
        int j = 0;
        int n = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                result[j] = nums[i];
            }
            else{
                n = i + 1;
                while (n < nums.length){
                    if (nums[n] > max){
                        if (j == 0){
                            result[j] = result[n];
                            break;
                        }
                        for (;j < n;j++){
                            result[j] = nums[n];
                        }
                        break;
                    }
                    n ++;
                }
                if (n == nums.length){
                    if (j == 0){
                        result[j] = -1;
                    }
                    else{
                        for (; j < n; j++) {
                            result[j] = -1;
                        }
                    }
                }
            }
            if (j == nums.length){
                break;
            }
            else if (j != i - 1){
                i = j;
            }
            else{
                j ++;
            }
            max = nums[i];
        }
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == nums[nums.length - 1]){
                break;
            }
        }
        result[nums.length - 1] = i == (nums.length - 1) ? -1 : result[i];
        return result;
    }

    public static int[] nextGreaterElementsChange(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        for(int i = 0; i < 2 * nums.length - 1; i++) {
            int index = i % nums.length;
            while(!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                res[stack.pop()] = nums[index];
            }
            stack.push(index);
        }
        return res;
    }
}
