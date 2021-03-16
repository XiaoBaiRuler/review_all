package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/16 8:17
 * @Version 1.0
 */
public class OneDay30 {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        ListNode item = new ListNode(0, null);
        ListNode head = item;
        for (int i = 1; i < nums.length; i++) {
            item.next = new ListNode(nums[i], null);
            item = item.next;
        }
        ListNode result = rotateRight(head, 3);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode item = head;
        ListNode pre = null;
        int count = 0;
        while (item != null){
            count ++;
            pre = item;
            item = item.next;
        }
        if (k >= count){
            k = k % count;
        }
        if (k == 0){
            return head;
        }
        ListNode node = head;
        int i = count - k - 1;
        while (i > 0){
            node = node.next;
            i --;
        }
        ListNode res = node.next;
        node.next = null;
        pre.next = head;
        return res;
    }
}
