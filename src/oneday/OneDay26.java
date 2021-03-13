package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/13 9:18
 * @Version 1.0
 */
public class OneDay26 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
    public static String addBinary(String a, String b) {
        int all1 = a.length() - 1;
        int all2 = b.length() - 1;

        StringBuilder sb = new StringBuilder();

        int one = 0;
        int two = 0;

        int add = 0;
        int now = 0;
        while (all1 >= 0 && all2 >= 0){
            one = a.charAt(all1) == '1' ? 1 : 0;
            two = b.charAt(all2) == '1' ? 1 : 0;

            now = add ^ (one ^ two);
            // 至少一个1
            if ((one | two) == 1){
               if (add == 0){
                   // 两个都为1
                   add = (one & two) == 1 ? 1 : 0;
               }
            }
            else{
                add = 0;
            }
            sb.append(now);
            all1--;
            all2--;
        }
        while (all1 >= 0){
            one = a.charAt(all1) == '1' ? 1 : 0;
            if (add == 1){
                now = add ^ one;
                add = add & one;
                sb.append(now);
            }
            else {
                sb.append(one);
            }
            all1 --;
        }
        while (all2 >=0){
            two = b.charAt(all2) == '1' ? 1 : 0;
            if (add == 1){
                now = add ^ two;
                add = add & two;
                sb.append(now);
            }
            else {
                sb.append(two);
            }
            all2 --;
        }
        if (add == 1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
