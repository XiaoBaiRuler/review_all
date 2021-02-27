package oneday;

/**
 * @Author xiaobai
 * @Date 2021/2/23 11:09
 * @Version 1.0
 */
public class OneDay07 {
    public static void main(String[] args) {
        int[] nums = {-5,-3,-3,-2,7,1};
        int[] multipliers = {-10,-5,3,4,6};
        System.out.println(maximumScore(nums, multipliers));
    }

    public static int maximumScore(int[] nums, int[] multipliers) {

        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        int item = 0;
        for (int i : multipliers) {
            item = nums[left] * i - nums[right] * i;
            if (item >= 0){
                result += nums[left] * i;
                left ++;
            }
            else {
                result += nums[right] * i;
                right --;
            }
        }
        return result;
    }
}
