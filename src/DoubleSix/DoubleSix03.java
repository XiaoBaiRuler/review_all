package DoubleSix;/**
 * @Author xiaobai
 * @Date 2021/3/31 10:14
 * @Version 1.0
 */
public class DoubleSix03 {
    public static void main(String[] args) {
        int[][] all = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(searchMatrix(all, 90));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int temp =  matrix[0].length - 1;
        int hl = 0;
        int hr = matrix.length - 1;
        int center = 0;
        while (hl <= hr){
            center = (hl + hr) >> 1;
            if (matrix[center][0] == target || matrix[center][temp] == target){
                return true;
            }
            else if (matrix[center][0] < target && matrix[center][temp] > target){
                break;
            }
            else if (matrix[center][0] < target){
                hl = center + 1;
            }
            else if (matrix[center][temp] > target){
                hr = center - 1;
            }
        }
        hl = 0;
        hr = temp;
        temp = center;
        while (hl <= hr){
            center = (hl + hr) >> 1;
            if (matrix[temp][center] == target){
                return true;
            }
            else if (matrix[temp][center] < target){
                hl = center + 1;
            }
            else {
                hr = center - 1;
            }
        }
        return false;
    }
}
