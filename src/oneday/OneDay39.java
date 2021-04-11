package oneday;


/**
 * @Author xiaobai
 * @Date 2021/3/25 8:58
 * @Version 1.0
 */
public class OneDay39 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, -4, -3, -2, -1};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        int preMax = Integer.MIN_VALUE;
        int flag = 0;
        int min = Integer.MAX_VALUE;
        int pre = 0;
        boolean item = true;
        int reb = 0;
        int r = 0;
        while (reb < nums.length){
            for (int i = reb; i < nums.length; i++) {
                if (nums[i] > preMax){
                    preMax = nums[i];
                    flag = 1;
                    r = i;
                    item = true;
                    continue;
                }
                if (nums[i] < preMax && flag == 1){
                    for (int j = i - 1; j >= pre && item; j--) {
                        if (min > nums[j]){
                            min = nums[j];
                        }
                    }
                    if (min < nums[i]){
                        return true;
                    }
                    pre = i;
                    item = false;
                }
            }
            reb = r + 1;
            pre = r + 1;
            preMax = Integer.MIN_VALUE;
        }
        return false;
    }
}
