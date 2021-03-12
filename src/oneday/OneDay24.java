package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/12 9:22
 * @Version 1.0
 */
public class OneDay24 {

    public static void main(String[] args) {
        int[] nums = {1, 2,3, 5, 6, 5, 7, 7, 7};
        ListNode item = new ListNode(1, null);
        ListNode head = item;
        for (int i = 1; i < nums.length; i++) {
            item.next = new ListNode(nums[i], null);
            item = item.next;
        }
        ListNode result = removeElements(head, 7);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        if (head == null){
            return null;
        }
        ListNode pre = head;
        ListNode item = head.next;
        while (item != null){
            if(item.val == val){
                pre.next = item.next;
                item = item.next;
                continue;
            }
            pre = pre.next;
            item = item.next;
        }
        return head;
    }

}
