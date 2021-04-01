package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/1 19:31
 * @Version 1.0
 */
public class DoubleSix05 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(15));
    }

    public static int arrangeCoins(int n) {
        long k = 2L * n;
        int i = 0;
        int center;
        long all;
        while (i <= n){
            center = (n + i) >> 1;
            all = (long) center * (center + 1);
            if (all == k){
                return center;
            }
            else if (all > k){
                n = center - 1;
            }
            else{
                i = center + 1;
            }
        }
        return i - 1;
    }
}
