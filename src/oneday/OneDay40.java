package oneday;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xiaobai
 * @Date 2021/3/25 21:27
 * @Version 1.0
 */
public class OneDay40 {
    public static void main(String[] args) {
        String currentState = "+";
        System.out.println(generatePossibleNextMoves(currentState));
    }

    public static List<String> generatePossibleNextMoves(String currentState) {
        int all = currentState.length() - 1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < all; i++) {
            if (currentState.charAt(i) == '+' && currentState.charAt(i + 1) == '+'){
                StringBuilder sb = new StringBuilder(currentState);
                sb.replace(i, i + 2, "--");
                list.add(sb.toString());
            }
        }
        return list;
    }
}
