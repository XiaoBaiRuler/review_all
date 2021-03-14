package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/14 9:23
 * @Version 1.0
 */
public class OneDay28 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        while (num >= 10){
            num = countDigits(num);
        }
        return num;
    }
    private static int countDigits(int num){
        int count = 0;
        while (num != 0){
            count += num % 10;
            num = num / 10;
        }
        return count;
    }
}
