package oneday;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author xiaobai
 * @Date 2021/3/13 8:58
 * @Version 1.0
 */
public class OneDay25 {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3));
        myHashSet.add(2);
        System.out.println(myHashSet.contains(2));
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2));
    }
}
class MyHashSet {

    LinkedList<Integer>[] list;
    private final static int SIZE = 37;

    /** Initialize your data structure here. */
    public MyHashSet() {
        list = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        if (!contains(key)){
            list[key % SIZE].add(key);
        }
    }

    public void remove(int key) {
        if (contains(key)){
            list[key % SIZE].removeIf(a -> a == key);
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        LinkedList<Integer> item = list[key % SIZE];
        if (!item.isEmpty()){
            for (Integer integer : item) {
                if (integer == key) {
                    return true;
                }
            }
        }
        return false;
    }
}