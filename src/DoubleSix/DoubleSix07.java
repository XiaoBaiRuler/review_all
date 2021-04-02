package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/2 12:03
 * @Version 1.0
 */
public class DoubleSix07 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
        int count = 0;
        int max = 0;
        for (int j : height) {
            if (j > max) {
                max = j;
            }
        }
        for (int i = 0; i <= max; i++) {
            count += countOne(height);
            for (int j = 0; j < height.length; j++) {
                if (height[j] != 0){
                    height[j] --;
                }
            }
        }
        return count;
    }
    private static int countOne(int[] height){
        int count = 0;
        int i = 0;
        while (i < height.length && height[i] == 0){
            i ++;
        }
        int j = 0;
        for (; i < height.length; i++) {
            if (height[i] != 0){
                if (j == 0){
                    continue;
                }
                count += j;
                j = 0;
            }
            else{
                j ++;
            }
        }
        return count;
    }

}
