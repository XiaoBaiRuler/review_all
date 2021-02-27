package oneday;

/**
 * @Author xiaobai
 * @Date 2021/2/19 11:32
 * @Version 1.0
 */
public class OneDay04 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0};
        System.out.println(minKBitFlips(nums, 1));
    }

    public static int minKBitFlips(int[] A, int K) {
        int result = 0;
        for (int i = 0; i < A.length; i ++) {
            boolean flag = false;
            for (int j = i; j < A.length; j += K) {
                if (j + K < A.length) {
                    result += check(A, j, j + K);
                }
                else {
                    for (int k = j; k < A.length; k++) {
                        if (A[k] == 0){
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if (!flag){
                return result;
            }
            else {
                result = 0;
            }
        }
        return -1;
    }

    private static int check(int[] a, int j, int i) {
        int item = 0;
        for (int k = j; k < i; k++) {
            if (a[k] == 0){
                a[k] = 1;
                item = 1;
            }
            else{
                a[k] = 0;
            }
        }
        return item;

    }
}
