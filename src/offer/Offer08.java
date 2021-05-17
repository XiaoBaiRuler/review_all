package offer;

/**
 * @Author xiaobai
 * @Date 2021/5/9 11:39
 * @Version 1.0
 */
public class Offer08 {
    public static void main(String[] args) {

    }
    public static int minArray(int[] numbers) {
        if (numbers.length == 0){
            return -1;
        }
        int pre = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= pre){
                pre = numbers[i];
            }
            else{
                return numbers[i];
            }
        }
        return pre;
    }
}
