package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/14 8:00
 * @Version 1.0
 */
public class OneDay27 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1};
        ListNode item = new ListNode(1, null);
        ListNode head = item;
        for (int i = 1; i < nums.length; i++) {
            item.next = new ListNode(nums[i], null);
            item = item.next;
        }
        ListNode result = deleteDuplicates(head);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        int val = head.val;
        ListNode item = head;
        ListNode res = head;
        ListNode node = head;
        while ((head = head.next) != null){
            if (head.val != val){
                node.next = head;
                val = head.val;
                node = head;
            }
            item = item.next;
        }
        node.next = null;
        return res;
    }
}
