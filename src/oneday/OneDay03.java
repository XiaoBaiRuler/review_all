package oneday;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author xiaobai
 * @Date 2021/2/18 10:30
 * @Version 1.0
 */
public class OneDay03 {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.deepToString(matrixReshape(nums, 4, 4)));
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length){
            return nums;
        }
        if (r == nums.length && c == nums[0].length){
            return nums;
        }
        int[][] result = new int[r][c];
        int m = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[m][n] = nums[i][j];
                n ++;
                if (n == c){
                    m ++;
                    n = 0;
                }
            }
        }
        return result;
    }
}
