package DoubleSix;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/3/30 11:18
 * @Version 1.0
 */
public class DoubleSix02 {

    public static void main(String[] args) {

    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }
}
