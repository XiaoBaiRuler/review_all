package DoubleSix;

import oneday.ListNode;

/**
 * @Author xiaobai
 * @Date 2021/3/29 21:21
 * @Version 1.0
 */
public class DoubleSix01 {
    public static void main(String[] args) {

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode node = headA;
        ListNode item = headB;
        while(node != item){
            if (node == null){
                node = headB;
            }
            else{
                node = node.next;
            }
            if (item == null){
                item = headA;
            }
            else{
                item = item.next;
            }
        }
        return node;
    }
}
