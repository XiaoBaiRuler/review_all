package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/25 7:41
 * @Version 1.0
 */
public class Offer14 {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(100));
    }
    public static int numberOfMatches(int n) {
        int all = 0;
        while (n != 1){
            if (n % 2 == 0){
                all += n >> 1;
                n = n >> 1;
            }
            else{
                all += (n - 1) >> 1;
                n = ((n - 1) >> 1) + 1;
            }
        }
        return all;
    }
}
