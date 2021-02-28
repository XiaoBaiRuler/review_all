package oneday;

/**
 * @Author xiaobai
 * @Date 2021/2/28 15:47
 * @Version 1.0
 */
public class OneDay11 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] A) {
        if (A.length == 1){
            return true;
        }
        boolean maxFlag = false;
        boolean minFlag = false;
        int j = 0;
        for (int i = 1; i < A.length; i++) {

            if (A[j] < A[i]){
                maxFlag = true;
            }
            else if (A[j] > A[i]){
                minFlag = true;
            }

            if (maxFlag && minFlag){
                return false;
            }
            j++;
        }
        return true;
    }
}
