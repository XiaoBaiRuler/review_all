package oneday;

import java.util.*;

/**
 * @Author xiaobai
 * @Date 2021/3/24 11:07
 * @Version 1.0
 */
public class OneDay38 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node;
        while (!queue.isEmpty()){
            int all = queue.size();
            List<Integer> list = new ArrayList<>(all);
            for (int i = 0; i < all; i++) {
                node = queue.poll();
                assert node != null;
                list.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;

    }
}
