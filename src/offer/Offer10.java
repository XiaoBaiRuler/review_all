package offer;

import oneday.ListNode;

/**
 * @Author xiaobai
 * @Date 2021/5/19 9:20
 * @Version 1.0
 */
public class Offer10 {
    public static void main(String[] args) {
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }
        ListNode node;
        if (l1.val < l2.val){
            node = l1;
            l1 = l1.next;
        }
        else{
            node = l2;
            l2 = l2.next;
        }
        ListNode head = node;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                node.next = l1;
                l1 = l1.next;
            }
            else{
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        while (l1 != null){
            node.next = l1;
            l1 = l1.next;
            node = node.next;
        }
        while(l2 != null){
            node.next = l2;
            l2 = l2.next;
            node = node.next;
        }
        return head;
    }
}
