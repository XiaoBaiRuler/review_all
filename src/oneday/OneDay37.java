package oneday;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/23 9:21
 * @Version 1.0
 */
public class OneDay37 {

    public static void main(String[] args) {
//        int[] nums = {1};
//        ListNode head = new ListNode(1, null);
//        ListNode item = head;
//        for (int i = 1; i < nums.length; i++) {
//            item.next = new ListNode(nums[i], null);
//            item = item.next;
//        }
        reorderList(null);
//        while (head != null){
//            System.out.print(head.val + " ");
//            head = head.next;
//        }
    }

    public static void reorderList(ListNode head) {
        if (head == null){
            return;
        }
        Pair<ListNode, Integer> result = reverseList(head);
        int count = result.getValue();
        head = result.getKey();

        boolean flag = false;
        if (count - ((count >> 1) << 1) != 0){
            flag = true;
        }

        count = count >> 1;
        List<ListNode> nodes = new ArrayList<>();
        ListNode item = head;
        int all = count;
        while (count > 0){
            nodes.add(item);
            item = item.next;
            count --;
        }

        result = reverseList(head);
        head = result.getKey();

        ListNode node = head;
        ListNode next = head;
        ListNode pre = null;
        for (int i = 0; i < all; i++) {
            item = nodes.get(i);
            next = node.next;
            node.next = item;
            item.next = next;
            pre = node;
            node = next;
        }
        if (node != null && flag){
            node.next = null;
        }
        if (pre != null && !flag){
            pre.next = node;
            node.next = null;
        }
    }
    private static Pair<ListNode, Integer> reverseList(ListNode head){
        ListNode pre = head;
        ListNode now = head.next;
        ListNode next = now;
        int count = 1;
        while (now != null){
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
            count ++;
        }
        head.next = null;
        head = pre;
        return new Pair<>(head, count);
    }
}
