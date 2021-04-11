package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/10 11:09
 * @Version 1.0
 */
public class DoubleSix16 {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwsyz";
        System.out.println(reverseStr(s, 4));
    }

    public static String reverseStr(String s, int k) {
        int all = s.length() % (2 * k);
        int i = s.length() / (2 * k);
        int j = 0;
        StringBuilder sb = new StringBuilder(s);
        while (j < i){
            reverse(sb, j * 2 * k, (j * 2 + 1) * k - 1);
            j ++;
        }

        if (all < k){
            reverse(sb, i * 2 * k, s.length() - 1);
        }
        else if (all < 2 * k){
            reverse(sb, i * 2 * k, (i * 2 + 1) * k - 1);
        }
        return sb.toString();
    }
    private static StringBuilder reverse(StringBuilder sb, int l, int r){
        int center = ((l + r) >> 1) - l;
        char item;
        for (int i = 0; i <= center; i++) {
            item = sb.charAt(l + i);
            sb.setCharAt(l + i, sb.charAt(r - i));
            sb.setCharAt(r - i, item);
        }
        return sb;
    }
}
