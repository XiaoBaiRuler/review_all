package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/17 8:59
 * @Version 1.0
 */
public class Offer09 {
    public static void main(String[] args) {
        System.out.println(numWays(0));
    }

    public static int numWays(int n) {
        if (n <= 1){
            return 1;
        }
        int i = 1;
        int j = 1;
        int item = 0;
        while (n > 1){
            item = i + j;
            if (item > 1000000007){
                item -= 1000000007;
            }
            i = j;
            j = item;
            n --;
        }
        return n % 2 ==  0 ? i % 1000000007 : j % 1000000007;
    }
}
