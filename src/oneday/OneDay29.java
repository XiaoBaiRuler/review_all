package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/15 9:16
 * @Version 1.0
 */
public class OneDay29 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ListNode item = new ListNode(1, null);
        ListNode head = item;
        for (int i = 1; i < nums.length; i++) {
            item.next = new ListNode(nums[i], null);
            item = item.next;
        }
        ListNode result = reverseBetween(head, 2, 4);
        while (result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode rev1 = head;
        ListNode rev2 = head;
        ListNode pre = head;
        ListNode node = head;
        ListNode item;
        int count = 1;
        while (node != null){
            if (count == left - 1){
                rev1 = node;
                pre = node.next;
                rev2 = pre;
            }
            else if (count > left && count <= right){
                item = node;
                node = node.next;
                item.next = pre;
                pre = item;
                count ++;
                continue;
            }
            else if (count == right + 1){
                rev1.next = pre;
                rev2.next = node;
                break;
            }
            count ++;
            node = node.next;
        }
        if (node == null && left != 1){
            rev1.next = pre;
            rev2.next = null;
        }
        else if (node != null && left == 1){
            head = pre;
            rev1.next = node;
        }
        else if (node == null){
            head = pre;
            rev1.next = null;
        }
        return head;
    }
}
