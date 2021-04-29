package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/26 19:39
 * @Version 1.0
 */
public class DoubleSix25 {
    public static void main(String[] args) {
        System.out.println(sumNums(1));
    }
    public static int sumNums(int n) {
        // 算不算掩耳盗铃呀
        return ((int)Math.pow(n, 2) + n) >> 1;
    }
}
