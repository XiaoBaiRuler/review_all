package offer;

import oneday.ListNode;


/**
 * @Author xiaobai
 * @Date 2021/5/2 9:00
 * @Version 1.0
 */
public class Offer01 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null){
            size ++;
            node = node.next;
        }
        int[] result = new int[size];
        while (head != null){
            result[--size] = head.val;
            head = head.next;
        }
        return result;
    }
}
