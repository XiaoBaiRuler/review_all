package DoubleSix;

/**
 * @Author xiaobai
 * @Date 2021/4/24 21:41
 * @Version 1.0
 */
public class DoubleSix24 {
    public static void main(String[] args) {
        System.out.println(replaceSpace(""));
    }
    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' '){
                sb.replace(i, i + 1, "%20");
                i = i + 2;
            }
        }
        return sb.toString();
    }
}
