package DoubleSix;

import oneday.ListNode;

/**
 * @Author xiaobai
 * @Date 2021/4/4 13:08
 * @Version 1.0
 */
public class DoubleSix10 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 0, -4};
        ListNode item = new ListNode(3, null);
        ListNode head = item;
        ListNode circle = null;
        for (int i = 1; i < nums.length; i++) {
            item.next = new ListNode(nums[i], null);
            item = item.next;
            if (i == 1){
                circle = item;
            }
        }
        item.next = circle;
        System.out.println(detectCycle(head));
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode item = head;
        ListNode circle = null;
        while(item != null){
            if (item.val > 100000){
                circle = item;
                break;
            }
            else{
                item.val += 200001;
            }
            item = item.next;
        }
        while (head != null){
            if (head.val > 100000){
                head.val -= 200001;
            }
            else{
                break;
            }
            head = head.next;
        }
        return circle;
    }
}
