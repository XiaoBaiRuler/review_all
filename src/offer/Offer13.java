package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/23 9:26
 * @Version 1.0
 */
public class Offer13 {
    public static void main(String[] args) {
        // 动态规划是什么?
        int[] nums = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(nums));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int i = cost[0];
        int j = cost[1];
        int item;
        for (int k = 2; k < cost.length; k++) {
            i = Math.min(i, j) + cost[k];
            item = i;
            i = j;
            j = item;
        }
        return Math.min(i, j);
    }
}
