package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/27 11:12
 * @Version 1.0
 */
public class OneDay42 {

    public static void main(String[] args) {
        String s = "aec";
        String t = "abcde";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int all1 = s.length();
        int all2 = t.length();
        int i = 0, j = 0;
        while (i < all1 && j < all2){
            if (s.charAt(i) == t.charAt(j)){
                i ++;
                j ++;
            }
            else{
                j ++;
            }
        }
        return i == all1;
    }
}
