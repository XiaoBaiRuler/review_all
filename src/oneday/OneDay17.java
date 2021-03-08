package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/8 10:47
 * @Version 1.0
 */
public class OneDay17 {
    public static void main(String[] args) {
        String s = "1";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        int all = s.length();
        int item = 0;
        int i = 0;
        for (; i < all; i++) {
            if (s.charAt(i) == '1'){
                item ++;
            }
            else{
                break;
            }
        }
        while (i < all){
            if (s.charAt(i) == '1') {
                return false;
            }
            i ++;
        }
        return true;
    }
}
