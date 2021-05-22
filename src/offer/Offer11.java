package offer;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/5/21 19:56
 * @Version 1.0
 */
public class Offer11 {
    public static void main(String[] args) {
        printBigNumbers(2);
    }
    public static int[] printNumbers(int n) {
        int[] result = new int[(int) (Math.pow(10, n) - 1)];
        for (int k = 0; k < result.length; k++) {
            result[k] = k + 1;
        }
        return result;
    }

    /**
     * 全排列
     * @param n int
     */
    private static void printBigNumbers(int n){
        printItem(new StringBuilder(), n);
    }
    private static void printItem(StringBuilder str, int n){
        if (str.length() == n){
            System.out.print(str + " ");
        }
        else{
            for (int i = 0; i <= 9; i++) {
                str.append(i);
                printItem(str, n);
                str.delete(str.length() - 1, str.length());
            }
        }
    }
}
