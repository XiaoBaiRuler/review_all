package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/6 9:12
 * @Version 1.0
 */
public class Offer05 {
    public static void main(String[] args) {
        int[] nums = {0,0, 1};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[nums[i] >= 100001 ? nums[i] - 100001 : nums[i]] >= 100001){
                return nums[i] >= 100001 ? nums[i] - 100001 : nums[i];
            }
            else{
                nums[nums[i] >= 100001 ? nums[i] - 100001 : nums[i]] += 100001;
            }
        }
        return 0;
    }
}
