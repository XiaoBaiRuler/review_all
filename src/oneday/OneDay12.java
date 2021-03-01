package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/1 10:30
 * @Version 1.0
 */
public class OneDay12 {
    public static void main(String[] args) {

    }

}

class NumArray {

    private int[] result;

    public NumArray(int[] nums) {
        if (nums == null){
            return;
        }
        result = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            result[i + 1] = result[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return result[j + 1] - result[i];
    }
}