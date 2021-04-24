package DoubleSix;

import oneday.ListNode;

/**
 * @Author xiaobai
 * @Date 2021/4/17 10:17
 * @Version 1.0
 */
public class DoubleSix23 {
    public static void main(String[] args) {
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        int i = 0;
        ListNode node = head;
        while (head != null){
            i ++;
            if (i > k){
                node = node.next;
            }
            head = head.next;
        }
        return node;
    }
}
