package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/11 9:05
 * @Version 1.0
 */
public class OneDay22 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("xiaobai"));
    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int all = s.length() - 1;
        if ("".equals(s) || all == -1){
            return 0;
        }
        int i = all;
        for (; i >= 0 ; i--) {
            if(s.charAt(i) == ' '){
                break;
            }
        }
        return all - i;
    }
}
