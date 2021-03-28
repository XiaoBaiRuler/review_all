package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/28 11:28
 * @Version 1.0
 */
public class OneDay43 {

    private static int pick = 2;

    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }

    public static int guessNumber(int n) {
        int i = 0;
        long left = 0;
        long right = n;
        int center = n >> 1;
        while ((i = guess(center)) != 0){
            if (i == -1){
                right = center - 1;
            }
            else {
                left = center + 1;
            }
            center = (int)((left + right) >> 1);
        }
        return center;
    }

    public static int guess(int num){
        if (num == pick){
            return 0;
        }
        else if (num < pick){
            return 1;
        }
        else {
            return -1;
        }
    }
}
