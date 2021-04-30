package DoubleSix;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @Author xiaobai
 * @Date 2021/4/29 17:17
 * @Version 1.0
 */
public class DoubleSix26 {
    public static void main(String[] args) {
        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());
    }

}

class MaxQueue {
    PriorityQueue<Integer> priority;
    LinkedList<Integer> linkedList;

    public MaxQueue() {
        priority = new PriorityQueue<>(Comparator.reverseOrder());
        linkedList = new LinkedList<>();
    }

    public int max_value() {
        return priority.size() == 0 ? -1 : priority.peek();
    }

    public void push_back(int value) {

        priority.add(value);
        linkedList.add(value);
    }

    public int pop_front() {
        if (linkedList.size() == 0){
            return -1;
        }
        else{
            Iterator<Integer> it = priority.iterator();
            while (it.hasNext()){
                if (it.next().equals(linkedList.peek())){
                    it.remove();
                    break;
                }
            }
            return linkedList.removeFirst();
        }
    }
}
