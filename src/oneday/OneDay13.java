package oneday;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/3/3 10:09
 * @Version 1.0
 */
public class OneDay13 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(8)));
    }

    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = size(i);
        }
        return result;
    }

    public static int[] countBitsChange(int num){
        int[] result = new int[num + 1];
        int highBit = 0;
        int i = 1;
        while (i <= num){
            if ((i & (i - 1)) == 0){
                highBit = i;
            }
            result[i] = result[i - highBit] + 1;
            i ++;
        }
        return result;
    }

    private static int sizeOf(int i){
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(i));
        int all = sb.length();
        int count = 0;
        for (int j = 0; j < all; j++) {
            if (sb.charAt(j) == '1'){
                count ++;
            }
        }
        return count;
    }

    private static int size(int i){
        int count = 0;
        while (i != 0){
            ++count;
            i = (i - 1) & i;
        }
        return count;
    }
}
