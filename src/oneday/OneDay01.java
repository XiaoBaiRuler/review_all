package oneday;

/**
 * @Author xiaobai
 * @Date 2021/2/15 16:45
 * @Version 1.0
 */
public class OneDay01 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count ++;
            }
            else{
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(count, max);
    }
}
