package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author xiaobai
 * @Date 2021/5/25 8:05
 * @Version 1.0
 */
public class Offer15 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(9973));
    }

    public static int maximumSwap(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0){
            list.add(num % 10);
            num = num / 10;
        }
        Collections.reverse(list);
        int max = 0;
        int all = list.size();
        for (int i = 0; i < all; i++) {
            max = i;
            for (int j = all - 1; j >= i; j--) {
                if (list.get(i) < list.get(j)){
                    if (list.get(max) < list.get(j)){
                        max = j;
                    }
                }
            }
            if (max != i){
                all = list.get(max);
                list.set(max, list.get(i));
                list.set(i, all);
                break;
            }
        }
        all = list.size() - 1;
        int item = 1;
        for (int i = all; i >= 0; i--) {
            all += list.get(i) * item;
            item *= 10;
        }
        return all - list.size() + 1;
    }
}
