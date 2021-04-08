package DoubleSix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author xiaobai
 * @Date 2021/4/7 9:16
 * @Version 1.0
 */
public class DoubleSix13 {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
        myStack.push(7);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}
class MyStack {

    Queue<Integer> queue;
    Queue<Integer> item;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        item = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue.isEmpty()){
            queue.add(x);
            while (!item.isEmpty()){
                queue.add(item.poll());
            }
        }
        else if (item.isEmpty()){
            item.add(x);
            while (!queue.isEmpty()){
                item.add(queue.poll());
            }
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (!item.isEmpty()){
            return item.poll();
        }
        if (!queue.isEmpty()){
            return queue.poll();
        }
        return -1;
    }


    /** Get the top element. */
    public int top() {
        if (!item.isEmpty()){
            return item.peek();
        }
        if (!queue.isEmpty()){
            return queue.peek();
        }
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty() && item.isEmpty();
    }
}
