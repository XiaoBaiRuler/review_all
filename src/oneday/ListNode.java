package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/12 9:20
 * @Version 1.0
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
