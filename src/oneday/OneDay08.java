package oneday;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/24 10:41
 * @Version 1.0
 */
public class OneDay08 {

    public static void main(String[] args) {
        int[][] nums = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        int[][] d = {
                {1},
                {0},
                {1}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(nums)));
    }

    public static int[][] flipAndInvertImage(int[][] A) {

        int center = A[0].length / 2;
        int all = A[0].length - 1;
        int item = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < center; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
                A[i][all - j] = A[i][all - j] == 0 ? 1 : 0;
                item = A[i][j];
                A[i][j] = A[i][all - j];
                A[i][all - j] = item;
            }
            if (A[i].length % 2 != 0){
                A[i][center] = A[i][center] == 0 ? 1: 0;
            }
        }
        return A;
    }
}
