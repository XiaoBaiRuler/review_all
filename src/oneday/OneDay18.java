package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/9 10:32
 * @Version 1.0
 */
public class OneDay18 {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        int all = sb.length();
        char item = ' ';
        int i = 0;
        while (i != all){
            for (; i < all; i++) {
                char a = sb.charAt(i);
                if (item != a){
                    item = a;
                }
                else{
                    sb.delete(i - 1, i + 1);
                    i = Math.max(i - 2, 0);
                    all = sb.length();
                    item = ' ';
                    break;
                }
            }
        }
        return sb.toString();
    }
}
