package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/8 10:21
 * @Version 1.0
 */
public class DoubleSix14 {

    public static void main(String[] args) {
        int[][] nums = {
                {3, 4, 5, 1, 2},
                {5, 1, 2, 3, 4},
                {4, 5, 6, 7, 0, 1, 2},
                {11, 13, 15, 17}
        };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(findMin(nums[i]));
        }
    }

    public static int findMin(int[] nums) {
        int j = 0;
        int i = 1;
        while (i < nums.length && nums[j] < nums[i]){
            i ++;
            j ++;
        }
        return i == nums.length ? nums[0] : nums[i];
    }
}
