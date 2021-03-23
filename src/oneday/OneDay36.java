package oneday;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/22 11:06
 * @Version 1.0
 */
public class OneDay36 {

    public static void main(String[] args) {

    }

    public static Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        Node result = new Node(head.val);
        Node res = result;
        Node node = head.next;
        Node item = null;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        if (head.random == null){
            list.add(-1);
        }
        else{
            item = head.random;
            while (item != null){
                count ++;
                item = item.next;
            }
            list.add(count);
            count = 0;
        }
        while (node != null){
            res.next = new Node(node.val);
            if (node.random == null){
                list.add(-1);
            }
            else{
                item = node.random;
                while (item != null){
                    count ++;
                    item = item.next;
                }
                list.add(count);
                count = 0;
            }
            res = res.next;
            node = node.next;
        }
        res = result;
        for (int i : list){
            if (i == -1){
                res.random = null;
            }
            else{
                item = result;
                while (i >= 0){
                    item = item.next;
                    i --;
                }
                res.random = item;
            }
            res = res.next;
        }
        return result;
    }
}
