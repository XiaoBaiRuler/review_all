package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/15 8:58
 * @Version 1.0
 */
public class DoubleSix21 {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(search(nums, 2));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int center;
        while (l <= r){
            center = (l + r) >> 1;
            if (nums[center] == target){
                return center;
            }
            else if (nums[center] < target){
                l = center + 1;
            }
            else{
                r = center - 1;
            }
        }
        return -1;
    }
}
