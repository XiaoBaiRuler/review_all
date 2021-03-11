package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/11 8:48
 * @Version 1.0
 */
public class OneDay21 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int center = 0;
        while (left <= right){
            center = (left + right) / 2;
            if (nums[center] == target){
                return center;
            }
            else if (nums[center] > target){
                right = center - 1;
            }
            else{
                left = center + 1;
            }
        }
        return nums[center] > target ? center : center + 1;
    }
}
