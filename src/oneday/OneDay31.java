package oneday;

/**
 * @Author xiaobai
 * @Date 2021/3/17 9:11
 * @Version 1.0
 */
public class OneDay31 {
    public static void main(String[] args) {
        System.out.println(multiply("3", "14"));
    }

    public static String multiply(String num1, String num2) {
        if (num1 == null || num2 == null){
            return null;
        }
        if (num1.isEmpty() || num2.isEmpty()){
            return null;
        }
        if (num1.charAt(0) == '0' || num2.charAt(0) == '0'){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        String a;
        if (num1.length() < num2.length()){
            a = num1;
            num1 = num2;
            num2 = a;
        }
        int all1 = num1.length() - 1;
        int all2 = num2.length() - 1;
        int item = 0;
        int add = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = all2; i >= 0; i--) {
            for (int j = all1; j >= 0; j--) {
                item = (num1.charAt(j) - 48) * (num2.charAt(i) - 48);
                item += add;
                add = item / 10;
                sb.append(item - add * 10);
            }
            if (add != 0){
                sb.append(add);
                add = 0;
            }
            res = add(res, sb, count);
            count ++;
            sb.delete(0, sb.length());
        }
        return res.toString();
    }

    private static StringBuilder add(StringBuilder res, StringBuilder sb, int count){
        if (res.length() == 0){
            return res.append(sb.reverse());
        }
        int item = 0;
        int add = 0;
        int all1 = res.length() - 1;
        int all2 = sb.length() - 1;
        sb.reverse();
        StringBuilder re = new StringBuilder();
        while (count > 0){
            re.append(res.charAt(all1--));
            count --;
        }
        while (all1 >= 0 && all2 >= 0){
            item = (res.charAt(all1) - 48) + (sb.charAt(all2) - 48);
            item += add;
            add = item / 10;
            re.append(item - add * 10);
            all1 --;
            all2 --;
        }
        while (all1 >= 0){
            if (add != 0){
                item = (res.charAt(all1) - 48) + add;
                add = item / 10;
                re.append(item - add * 10);
            }
            else{
                re.append(res.charAt(all1));
            }
            all1 --;
        }
        while (all2 >= 0){
            if (add != 0){
                item = (sb.charAt(all2) - 48) + add;
                add = item / 10;
                re.append(item - add * 10);
            }
            else{
                re.append(sb.charAt(all2));
            }
            all2 --;
        }
        if (add != 0){
            re.append(add);
        }
        return re.reverse();
    }
}
