package oneday;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/20 8:38
 * @Version 1.0
 */
public class OneDay34 {

    public static void main(String[] args) {
        System.out.println(numSquares(17));
    }

    protected static boolean isSquare(int n) {
        int sq = (int) Math.sqrt(n);
        return n == sq * sq;
    }

    /**
     * 方法：四数之和 == xxx
     * 已证明: 如果n % 8 == 7时，一个整数等于四个整数的平方和
     * @param n n
     * @return int
     */
    public static int numSquares(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }

        if (isSquare(n)) {
            return 1;
        }
        for (int i = 1; i * i <= n; ++i) {
            if (isSquare(n - i * i)) {
                return 2;
            }
        }
        return 3;
    }
}
