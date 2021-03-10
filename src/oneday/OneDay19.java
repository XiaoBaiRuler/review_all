package oneday;

import java.util.ArrayList;

/**
 * @Author xiaobai
 * @Date 2021/3/10 9:23
 * @Version 1.0
 */
public class OneDay19 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int left = x;
        ArrayList<Integer> list = new ArrayList<>();
        while (x != 0){
            list.add(x % 10);
            x = x / 10;
        }
        int all = list.size();
        if (all % 2 != 0){
            return false;
        }
        long count = 0;
        for (int i = 0; i < all; i++) {
            count += list.get(i) * Math.pow(10, all - i - 1);
        }
        System.out.println(count);
        return left == count;
    }
}
