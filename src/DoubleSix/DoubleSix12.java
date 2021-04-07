package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/6 9:53
 * @Version 1.0
 */
public class DoubleSix12 {
    public static void main(String[] args) {
        String co = convert("ABCDEFGHIKLMNOPQ", 4);
        String te = "AB";
        System.out.println(co);
        System.out.println(co.equals(te));
    }
    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        if (len == 1 || numRows == 1){
            return s;
        }
        int all = (numRows - 1) << 1;
        for (int i = 0; i < len; i += all) {
            sb.append(s.charAt(i));
        }
        int j = numRows - 2;
        int item;
        for (int i = 1; i <= j; i++) {
            if (i >= len){
                break;
            }
            sb.append(s.charAt(i));
            item = i;
            for (int k = 1; k < len; k++) {
                item = all * k - item;
                if (item >= len){
                    break;
                }
                sb.append(s.charAt(item));
            }
        }
        for (int i = numRows - 1; i < len; i += all) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
