package DoubleSix;

import oneday.ListNode;

/**
 * @Author xiaobai
 * @Date 2021/4/11 11:32
 * @Version 1.0
 */
public class DoubleSix17 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode node = head;
        int[] nums = {1};
        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i], null);
            node = node.next;
        }
        head = insertionSortList(head);
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode insertionSortList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode node = head.next;
        ListNode item;
        ListNode swap;
        ListNode preItem = head;
        ListNode pre = head;
        while (node != null){
            item = head;
            while (item.val < node.val){
                pre = item;
                item = item.next;
            }
            if (item == head){
                swap = head;
                preItem.next = node.next;
                node.next = swap;
                head = node;
                node = preItem;
            }
            else if (item != node){
                swap = node.next;
                pre.next = node;
                node.next = item;
                preItem.next = swap;
                node = preItem;
            }
            preItem = node;
            node = node.next;
        }
        return head;
    }
}
