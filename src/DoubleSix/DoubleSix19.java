package DoubleSix;

import java.util.Collections;
import java.util.LinkedList;

/**
 * @Author xiaobai
 * @Date 2021/4/13 10:26
 * @Version 1.0
 */
public class DoubleSix19 {

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        for (int i = 0; i < 10000; i++) {
            System.out.println(movingAverage.next(3));
        }
    }
}
class MovingAverage {
    LinkedList<Integer> list;
    int size;
    double count;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        list = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        count += val;
        list.add(val);
        return list.size() <= size ? count / list.size() : (count -= list.removeFirst()) / size;
    }
}