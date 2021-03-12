package oneday;


/**
 * @Author xiaobai
 * @Date 2021/3/12 8:32
 * @Version 1.0
 */
public class OneDay23 {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag = checkPreSame(p, q);
        if (flag){
            flag = checkMinSame(p, q);
        }
        else{
            return false;
        }
        return flag;
    }

    private boolean checkPreSame(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        else if ((p != null && q == null))
        {
            return false;
        }
        else if (p == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        boolean flag;
        flag = checkPreSame(p.left, q.left);
        if (flag){
            flag = checkPreSame(p.right, q.right);
        }
        else{
            return false;
        }
        return flag;
    }

    private static boolean checkMinSame(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        else if ((p != null && q == null))
        {
            return false;
        }
        else if (p == null){
            return false;
        }
        boolean flag;
        flag = checkMinSame(p.left, q.left);
        if(p.val != q.val){
            return false;
        }
        if (flag){
            flag = checkMinSame(p.right, q.right);
        }
        else{
            return false;
        }
        return flag;
    }
}
