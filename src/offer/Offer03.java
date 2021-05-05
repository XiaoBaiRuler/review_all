package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/4 15:17
 * @Version 1.0
 */
public class Offer03 {
    public static void main(String[] args) {
        int[] nums = {0,1,3};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        if (nums[nums.length - 1] == (nums.length - 1)){
            return nums.length;
        }
        if (nums[0] == 1){
            return 0;
        }
        int l = 0;
        int r = nums.length;
        int center = 0;
        while (l <= r){
            center = (l + r) >> 1;
            if (center == nums[center]){
                l = center + 1;
            }
            else if (center < nums[center]){
                if (nums[center] == (center + 1) && nums[center - 1] == (center - 1)){
                    return center;
                }
                r = center - 1;
            }
            else{
                if (nums[center] == (center - 1) && nums[center + 1] == (center + 1)){
                    return center;
                }
                l = center + 1;
            }
        }
        return center;
    }
}
