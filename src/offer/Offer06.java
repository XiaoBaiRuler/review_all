package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/7 22:43
 * @Version 1.0
 */
public class Offer06 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums, 10));
    }

    public static int search(int[] nums, int target) {
        int i = findIndex(nums, target);
        if (i == -1){
            return 0;
        }
        else{
            int count = 1;
            int j = i - 1;
            while (j >= 0 && nums[j] == target){
                count ++;
                j --;
            }
            j = i + 1;
            while (j < nums.length && nums[j] == target){
                count ++;
                j ++;
            }
            return count;
        }
    }

    private static int findIndex(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int center;
        while (l <= r){
            center = (l + r) >> 1;
            if (nums[center] == target){
                return center;
            }
            else if (nums[center] > target){
                r = center - 1;
            }
            else{
                l = center + 1;
            }
        }
        return -1;
    }

}
