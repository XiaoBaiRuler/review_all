package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/8 9:41
 * @Version 1.0
 */
public class Offer07 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(Integer.MAX_VALUE));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0){
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
}
