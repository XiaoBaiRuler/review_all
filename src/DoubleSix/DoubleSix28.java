package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/5/2 8:20
 * @Version 1.0
 */
public class DoubleSix28 {
    public static void main(String[] args) {
        System.out.println(fib(94));
        int a = 807526948;

    }
    public static int fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n <= 2){
            return 1;
        }
        long p1 = 1;
        long p2 = 1;
        int i = 2;
        while (i < n){
            p1 = p1 + p2;
            if (p1 >= 1000000007){
                p1 -= 1000000007;
            }
            p2 = p1 + p2;
            if (p2 >= 1000000007){
                p2 -= 1000000007;
            }
            i += 2;
        }
        return n % 2 == 0 ? (int)(p2 % 1000000007) : (int)(p1 % 1000000007);
    }
}
