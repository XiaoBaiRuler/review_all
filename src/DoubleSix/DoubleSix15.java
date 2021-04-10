package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/9 10:43
 * @Version 1.0
 */
public class DoubleSix15 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "------" + isUgly(i));
        }
    }

    public static boolean isUgly(int n) {
        if (n <= 0){
            return false;
        }
        if (n == 1){
            return true;
        }
        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
            }
            else if (n % 3 == 0){
                n /= 3;
            }
            else if (n % 5 == 0){
                n /= 5;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
