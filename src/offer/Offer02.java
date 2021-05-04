package offer;

import oneday.ListNode;

/**
 * @Author xiaobai
 * @Date 2021/5/3 17:31
 * @Version 1.0
 */
public class Offer02 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode now = head.next;
        ListNode item = null;
        while (now != null){
            item = now;
            now = now.next;
            item.next = pre;
            pre = item;
        }
        head.next = null;
        return item;
    }
}
