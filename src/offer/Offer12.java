package offer;

import oneday.ListNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @Author xiaobai
 * @Date 2021/5/22 9:09
 * @Version 1.0
 */
public class Offer12 {
    public static void main(String[] args) {
        MinStackChange minStack = new MinStackChange();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }

}
class MinStack {

    Stack<Integer> stack;
    PriorityQueue<Integer> queue;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        queue = new PriorityQueue<>();
    }

    public void push(int x) {
        stack.push(x);
        queue.add(x);
    }

    public void pop() {
        queue.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        if (queue != null && !queue.isEmpty()){
            return queue.peek();
        }
        return -1;
    }
}

class MinStackChange {

    Stack<Integer> stack;
    ListNode node;
    ListNode head;

    /** initialize your data structure here. */
    public MinStackChange() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (head == null){
            head = new ListNode(x, null);
        }
        else{
            node = head;
            ListNode pre = null;
            while (node != null && node.val <= x){
                pre = node;
                node = node.next;
            }
            ListNode item = null;
            if (node == head){
                head = new ListNode(x, node);
            }
            else if (node != null){
                item = node.next;
                node.next = new ListNode(x, item);
            }
            else {
                pre.next = new ListNode(x, null);
            }
        }
    }

    public void pop() {
        int item = stack.pop();
        if (head.val == item){
            head = head.next;
        }
        else{
            ListNode pre = head;
            node = head.next;
            while (node != null){
                if (node.val == item){
                    pre.next = node.next;
                    break;
                }
                node = node.next;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return head != null ? head.val : -1;
    }
}