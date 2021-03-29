package oneday;

import java.util.Stack;

/**
 * @Author xiaobai
 * @Date 2021/3/29 11:23
 * @Version 1.0
 */
public class OneDay44 {

    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        String str1 = "3[a2[c]]";
        String str2 = "2[abc]3[cd]ef";
        String str3 = "abc3[cd]xyz";
        String str4 = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        System.out.println(decodeString(str4));
    }

    public static String decodeString(String s){
        int all = s.length();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        StringBuilder add = new StringBuilder();
        StringBuilder count = new StringBuilder();
        StringBuilder next = new StringBuilder();
        char item;
        int j = 0;
        for (int i = 0; i < all; i++) {
            item = s.charAt(i);
            if (item != ']'){
                stack.push(item);
            }
            else {
                while (!stack.isEmpty() && stack.peek() != '['){
                    add.append(stack.pop());
                }
                if (stack.peek() == '['){
                    stack.pop();
                }
                while (!stack.isEmpty() && isNumber(stack.peek())){
                    count.append(stack.pop());
                }
                j = count.length() != 0 ? Integer.parseInt(count.reverse().toString()) : 0;
                add.reverse();
                addString(next, add, j);
                for (int k = 0; k < next.length(); k++) {
                    stack.push(next.charAt(k));
                }
                next = new StringBuilder();
                count = new StringBuilder();
                add = new StringBuilder();
            }
        }
        while (!stack.isEmpty()){
            next.append(stack.pop());
        }
        sb.append(next.reverse());
        return sb.toString();
    }

    private static boolean isNumber(char c){
        return c <= 57 && c >= 48;
    }
    private static StringBuilder addString(StringBuilder next, StringBuilder add, int j){
        StringBuilder item = new StringBuilder(add);
        while (j > 1){
            if (j % 2 != 0){
                next.append(item);
            }
            item.append(item);
            j = j >> 1;
        }
        next.append(item);
        return next;
    }
}
