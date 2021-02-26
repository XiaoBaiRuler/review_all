package oneday;

import java.util.Arrays;

/**
 * @Author xiaobai
 * @Date 2021/2/26 9:52
 * @Version 1.0
 */
public class OneDay09 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1},
        };

        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix.length != matrix[0].length){
            int[][] result = new int[matrix[0].length][matrix.length];
            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    result[j][i] = matrix[i][j];
                }
            }
            return result;
        }
        int item = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (i != j){
                    item = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = item;
                }
            }
        }
        return matrix;
    }
}
